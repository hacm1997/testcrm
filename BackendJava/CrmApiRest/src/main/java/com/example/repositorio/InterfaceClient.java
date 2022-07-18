package com.example.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.modelos.Clients;

@Repository
public interface InterfaceClient extends CrudRepository<Clients, Integer>{

}
