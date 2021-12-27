package com.ser;

import java.util.ArrayList;
import java.util.Collection;

public class Facade {
	private int idp=0;
	private int ida=0;
	Collection<Personne> colP=new ArrayList<Personne>();
	public Collection<Personne> getColP() {
		return colP;
	}
	public void setColP(Collection<Personne> colP) {
		this.colP = colP;
	}
	public Collection<Adresse> getColA() {
		return colA;
	}
	public void setColA(Collection<Adresse> colA) {
		this.colA = colA;
	}
	Collection<Adresse> colA=new ArrayList<Adresse>();
	public void ajoutPersonne(String nom, String prenom) {
		idp++;
		colP.add(new Personne(nom,prenom,idp));
	}
	public void ajoutAdresse(String rue, String ville) {
		ida++;
		colA.add(new Adresse(rue,ville,ida));
	}
	public Collection<Personne> listePersonnes(){
		return colP;
	}
	public Collection<Adresse> listeAdresses(){
		return colA;
	}
	public void associer(int personneId, int adresseId) {
		for(Personne p :colP) {
			if(p.getIdP()==personneId) {
				for(Adresse a:colA) {
					if(a.getIdA()==adresseId) {
						p.setColAP(a);
						return;
					}
				}
			}
			
		}
	}
}
