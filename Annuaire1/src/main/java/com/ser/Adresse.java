package com.ser;


public class Adresse {
	private String rue;
	private String ville;
	private int idA=0;
	Adresse(String rue, String ville,int idA){
		this.rue = rue;
		this.ville = ville;
		this.idA = idA;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getIdA() {
		return idA;
	}
}
