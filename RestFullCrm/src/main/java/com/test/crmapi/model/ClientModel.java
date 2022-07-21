package com.test.crmapi.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ClientModel")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClientModel {
    @Override
    public String toString() {
        return "ClientModel{" +
                "id=" + id +
                ", cc=" + cc +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", cell_phone='" + cell_phone + '\'' +
                ", address='" + address + '\'' +
                ", tipy_contract='" + tipy_contract + '\'' +
                ", origen='" + origen + '\'' +
                '}';
    }

    public ClientModel(Integer id, Integer cc, String name, String last_name, String email, String cell_phone, String address, String tipy_contract, String origen) {
        this.id = id;
        this.cc = cc;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.cell_phone = cell_phone;
        this.address = address;
        this.tipy_contract = tipy_contract;
        this.origen = origen;
    }


    public ClientModel() {
    }

    @XmlElement
    private Integer id;
    @XmlElement
    private Integer cc;
    @XmlElement
    private String name;
    @XmlElement
    private String last_name;
    @XmlElement
    private String email;
    @XmlElement
    private String cell_phone;
    @XmlElement
    private String address;
    @XmlElement
    private String tipy_contract;
    @XmlElement
    private String origen;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell_phone() {
        return cell_phone;
    }

    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTipy_contract() {
        return tipy_contract;
    }

    public void setTipy_contract(String tipy_contract) {
        this.tipy_contract = tipy_contract;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
