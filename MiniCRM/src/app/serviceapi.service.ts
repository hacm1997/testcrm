import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceapiService {

  //Ruta de la API creada en django
  readonly EndPoint = "http://127.0.0.1:8000/";

  constructor(private http:HttpClient) {}
    
  
    //Método para obtener los tipos de usuarios
    getType():Observable<any[]>{
      return this.http.get<any[]>(this.EndPoint + 'restapi/show/');
    }

    //Método para agregar un tipo de usuario/cliente
    addType(val:any){
      return this.http.post(this.EndPoint + 'restapi/add/', val);
    }

    //Método para actualizar un tipo de usuario/cliente
    updateType(val:any){
      return this.http.put(this.EndPoint + 'restapi/show/', val);
    }

    //Mtodo para eliminar un tipo de usuario/cliente
    deleteType(val:any){
      return this.http.delete(this.EndPoint + 'restapi/show/' + val);
    }

    // Métodos de operaciones con los usuarios/clientes //

     //Metodo para obtener de mi API la lista de tipo de persona
     getListUser():Observable<any[]>{
      return this.http.get<any[]>(this.EndPoint + 'restapi/users/show/');
    }

    //Metodo para agregar a mi API un tipo de persona
    addUser(val:any){
      return this.http.post(this.EndPoint + 'restapi/users/add/', val);
    }

    //Metodo para actualizar de mi API un tipo de persona
    detailUser(val:any, id:number){
      return this.http.get<any>(this.EndPoint + 'restapi/users/show/' + id);
    }

    //Metodo para actualizar de mi API un tipo de persona
    updateUser(val:any, id:number){
      return this.http.put<any>(this.EndPoint + 'restapi/users/show/' + id, val);
    }

    //Metodo para eliminar de mi API un tipo de persona
    deleteUsers(id:number){
      return this.http.delete<any>(this.EndPoint + 'restapi/users/show/' + id);
    }

  }
