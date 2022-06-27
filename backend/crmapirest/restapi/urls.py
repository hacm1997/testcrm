from django.urls import path
from . import views

# URL'S DE LA API REST
urlpatterns = [
    # la api esta arrojada en la ruta localhost:8000/restapi
    path('show/', views.show_index),
    path('add/', views.add_type),
    path('show/<int:pk>', views.typePost)
]