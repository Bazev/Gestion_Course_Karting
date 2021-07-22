package com.hb.karttrainning.pojos;

public class Repas {
	
	protected static int inc = 1;
	protected int id;
	protected String nom;
	protected double prix;
	protected TypeRepas typeRepas;
	
	public Repas () {
		
	}
	public Repas(String nom, double prix, TypeRepas typeRepas) {
		super();
		this.id = inc++;
		this.nom = nom;
		this.prix = prix;
		this.typeRepas = typeRepas;
	}
	
	public static int getInc() {
		return inc;
	}
	public static void setInc(int inc) {
		Repas.inc = inc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public TypeRepas getTypeRepas() {
		return typeRepas;
	}
	public void setTypeRepas(TypeRepas typeRepas) {
		this.typeRepas = typeRepas;
	}
	@Override
	public String toString() {
		return "Repas [id=" + id + ", nom=" + nom + ", prix=" + prix + ", typeRepas=" + typeRepas + "]";
	}
	
	
	
	

}
