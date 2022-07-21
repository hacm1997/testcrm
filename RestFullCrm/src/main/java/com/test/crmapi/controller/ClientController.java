package com.test.crmapi.controller;

import com.test.crmapi.dao.ClientDao;
import com.test.crmapi.model.ClientModel;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/ApiRest/User")
public class ClientController {
    //Get Method controller
    @GET()
    @Path("/show")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ClientModel> getCli(){
        List<ClientModel> cli = (new ClientDao().read());
        return cli;
    }
    //POST or INSERT Method controller
    @POST()
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ClientModel setClient(ClientModel client){
        client = (new ClientDao().create(client));
        return client;
    }
    //PUT (Update) Method controller
    @PUT()
    @Path("/update/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ClientModel updateClient(@PathParam("id") Integer id, ClientModel client){
        client = (new ClientDao().Update(id, client));
        return client;
    }
    //DELETE Method controller
    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteClient(@PathParam("id") Integer id){
        new ClientDao().Delete(id);
        //return id;
    }

}
