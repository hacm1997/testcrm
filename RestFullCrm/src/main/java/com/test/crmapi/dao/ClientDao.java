package com.test.crmapi.dao;

import com.test.crmapi.model.ClientModel;
import com.test.crmapi.tools.ConnectionSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {
    //Method for GET Clients
    public List read(){
        ArrayList<ClientModel> listCli = new ArrayList<ClientModel>();

        try{
            Connection cone = ConnectionSQL.getConnection();
            PreparedStatement ps = cone.prepareStatement("SELECT * FROM clients_clients");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                ClientModel cli = new ClientModel();
                cli.setId(rs.getInt(1));
                cli.setCc(rs.getInt(2));
                cli.setName(rs.getString(3));
                cli.setLast_name(rs.getString(4));
                cli.setEmail(rs.getString(5));
                cli.setCell_phone(rs.getString(6));
                cli.setAddress(rs.getString(7));
                cli.setTipy_contract(rs.getString(8));
                cli.setOrigen(rs.getString(9));
                listCli.add(cli);
            }
            cone.close();
            rs.close();
            ps.close();
        }catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
        return listCli;
    }
    //Method Client INSERT
    public ClientModel create(ClientModel client){
        Connection conn = null;
        try{
            conn = ConnectionSQL.getConnection();
            conn.setAutoCommit(false);
            String Query = "INSERT INTO clients_clients (cc,name,last_name,email,cell_phone,address,tipy_contract,origen) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = null;
            ps = conn.prepareStatement(Query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, client.getCc());
            ps.setString(2, client.getName());
            ps.setString(3, client.getLast_name());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getCell_phone());
            ps.setString(6, client.getAddress());
            ps.setString(7, client.getTipy_contract());
            ps.setString(8, client.getOrigen());

            ps.executeUpdate();
            try(ResultSet generatedKeys= ps.getGeneratedKeys()){
                if(generatedKeys.next()){
                    client.setId(generatedKeys.getInt(1));
                }else{
                    throw new SQLException("Create contact fail, NO ID.");
                }
            }
            ps.close();
            conn.commit();
            conn.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return client;
    }
    //Method Client UPDATE
    public ClientModel Update(Integer id, ClientModel client){
        Connection conn = null;
        //System.out.println("the id is: "+id);
        try{
            conn = ConnectionSQL.getConnection();
            conn.setAutoCommit(false);
            String Query = "UPDATE clients_clients SET cc=?,name=?,last_name=?,email=?,cell_phone=?,address=?,tipy_contract=?,origen=? WHERE id=?";
            PreparedStatement ps = null;
            ps = conn.prepareStatement(Query);
            ps.setInt(1, client.getCc());
            ps.setString(2, client.getName());
            ps.setString(3, client.getLast_name());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getCell_phone());
            ps.setString(6, client.getAddress());
            ps.setString(7, client.getTipy_contract());
            ps.setString(8, client.getOrigen());
            ps.setInt(9, id);

            ps.executeUpdate();
            ps.close();
            conn.commit();
            conn.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return client;
    }

    //Method Client DELETE
    public void Delete(Integer id){
        Connection conn = null;
        //System.out.println("the id is: "+id);
        try{
            conn = ConnectionSQL.getConnection();
            conn.setAutoCommit(false);
            String Query = "DELETE FROM clients_clients WHERE id=?";
            PreparedStatement ps = null;
            ps = conn.prepareStatement(Query);
            ps.setInt(1, id);

            ps.executeUpdate();
            ps.close();
            conn.commit();
            conn.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

}
