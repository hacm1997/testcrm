from django.db import models
from restapi.models import Usuarios

# Create your models here.

class Clients(Usuarios):
    CLIENTE = 'Cliente'
    VENDERDOR = 'Vendedor'

    LA = 'LA'
    LB = 'LB'
    LC = 'LC'

    #Arrays list for contract and origen
    CONTRACT_LIST = [
        (CLIENTE, 'Cliente'),
        (VENDERDOR, 'Vendedor')
    ]

    ORIGEN_LIST = [
        (LA, 'LA'),
        (LB, 'LB'),
        (LC, 'LC')
    ]

    tipy_contract = models.CharField(max_length=255, null=True, blank=True, choices=CONTRACT_LIST)
    origen = models.CharField(max_length=255, null=True, blank=True, choices=ORIGEN_LIST)

    def __str__(self):
        return self.name