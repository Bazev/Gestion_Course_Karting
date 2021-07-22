package com.hb.karttrainning.pojos;

public class Kart {
	
	protected String immatriculation;
	protected String nom;
	protected double prix;
	
	public Kart() {
	}
	public Kart(String immatriculation, String nom, double prix) {
		super();
		this.immatriculation = immatriculation;
		this.nom = nom;
		this.prix = prix;
	}

	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "Kart [immatriculation=" + immatriculation + ", nom=" + nom + ", prix=" + prix + "]";
	}
	
	
	
	

}
