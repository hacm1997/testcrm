from django.db import models

# Create your models here.
class Type(models.Model):
    name = models.CharField(max_length=255, null=True, blank=True)

    def __str__(self):
        return self.name

class Usuarios(models.Model):
    cc = models.BigIntegerField()
    name = models.CharField(max_length=255, null=True, blank=True)
    last_name = models.CharField(max_length=255, null=True, blank=True)
    email = models.CharField(max_length=255, null=True, blank=True)
    cell_phone = models.CharField(max_length=255, null=True, blank=True)
    address = models.TextField(null=True, blank=True)
    #type = models.ForeignKey(Type, on_delete=models.CASCADE, null=True, blank=True)

    class Meta:
        abstract = True