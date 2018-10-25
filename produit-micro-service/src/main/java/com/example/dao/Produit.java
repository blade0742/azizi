package com.example.dao;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idProduit;
	private String designation;
	private double prix;
	public long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(long idProduit) {
		this.idProduit = idProduit;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Produit(String designation, double prix) {
		super();
		this.designation = designation;
		this.prix = prix;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
