from django.forms import model_to_dict
from django.shortcuts import render
from rest_framework.decorators import api_view
from rest_framework.response import Response
from restapi.models import Type
from restapi.serializers import TypeSerializer

# Create your views here.
@api_view(['GET'])
def show_index(request):
    instances = Type.objects.all()
    serializer = TypeSerializer(instances, many=True)
    return Response(serializer.data)

# Metodo para crear, se llama al serializer
@api_view(['POST'])
def add_type(request):
    serializer = TypeSerializer(data=request.data)
    if serializer.is_valid():
        serializer.save()
        return Response(serializer.data)
    else:
        return Response(serializer.errors)

@api_view(['GET', 'PUT', 'DELETE'])
def typePost(request, pk):
    instances = Type.objects.get(pk=pk)
    if request.method == 'GET':
        serializer = TypeSerializer(instances)
        return Response(serializer.data)

    if request.method == 'PUT':
        serializer = TypeSerializer(instances, data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response(serializer.data)
        return serializer.errors

    if request.method == 'DELETE':
        instances.delete()
        return Response({
            'delete': True
        })