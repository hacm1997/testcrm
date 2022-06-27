from dataclasses import fields
from rest_framework import serializers
from .models import Clients

class UsersSerializer(serializers.ModelSerializer):
    type_person = serializers.StringRelatedField()
    class Meta:
        model = Clients
        fields = '__all__'