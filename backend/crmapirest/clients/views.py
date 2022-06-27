from django.forms import model_to_dict
from django.shortcuts import render
from django.http import JsonResponse

from rest_framework.decorators import api_view
from rest_framework.response import Response

from clients.serializers import UsersSerializer
from clients.models import Clients

# Create your views here.
@api_view(['GET'])
def list_users(request):
    instances = Clients.objects.all()
    serializer = UsersSerializer(instances, many=True)
    return Response(serializer.data)

# Metodo para crear usuarios/clientes, se llama al serializer
@api_view(['POST'])
def create_user(request):
    serializer = UsersSerializer(data=request.data)
    if serializer.is_valid():
        serializer.save()
        return Response(serializer.data)
    else:
        return Response(serializer.errors)

@api_view(['GET', 'PUT', 'DELETE'])
def userPost(request, pk):
    instances = Clients.objects.get(pk=pk)
    if request.method == 'GET':
        serializer = UsersSerializer(instances)
        return Response(serializer.data)

    if request.method == 'PUT':
        serializer = UsersSerializer(instances, data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response(serializer.data)
        return serializer.errors

    if request.method == 'DELETE':
        instances.delete()
        return Response({
            'delete': True
        })