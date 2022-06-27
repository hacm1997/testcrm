from django.urls import path
from . import views

# URL'S DE LA API REST
urlpatterns = [
    # la api esta arrojada en la ruta localhost:8000/restapi
    path('show/', views.list_users),
    path('add/', views.create_user),
    path('show/<int:pk>', views.userPost)
]