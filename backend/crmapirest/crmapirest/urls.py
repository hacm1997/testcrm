from django.contrib import admin
from django.urls import path, include

urlpatterns = [
    path('admin/', admin.site.urls),
    path('restapi/', include('restapi.urls')),
    path('restapi/users/', include('clients.urls'))
]
