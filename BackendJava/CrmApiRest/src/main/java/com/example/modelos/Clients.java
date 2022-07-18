package com.example.modelos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="clients_clients", catalog="crm_database", schema="")
public class Clients {
	
	@Id
	@Column
	private Integer id;
	@Column
	private Integer cc;
	@Column
	private String name;
	@Column
	private String last_name;
	@Column
	private String email;
	@Column
	private String cell_phone;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")//Configuracion format Date
	private Date birthday;
	
	@Column
	private String address;
	@Column
	private String tipy_contract;
	@Column
	private String origen;
	
	/*Getters and Setters*/
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
