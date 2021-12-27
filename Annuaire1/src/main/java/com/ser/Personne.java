package com.ser;

import java.util.ArrayList;
import java.util.Collection;

public class Personne {
	private String nom;
	private String prenom;
	private int idP;
	Collection<Adresse> colAP=new ArrayList<Adresse>();
	Personne(String nom,String prenom,int idP){
		this.nom = nom;
		this.prenom = prenom;
		this.idP=idP;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getIdP() {
		return idP;
	}
	public void setColAP(Adresse e){
		colAP.add(e);
	}
	public Collection<Adresse> getColAP(){
		return colAP;
	}
	
	
	
}
