package com.hb.karttrainning.pojos;

public class Banane extends KartDecorator{

	public Banane(Kart kart) {
		super(kart);
		
		super.setNom(kart.getNom() + ", Banane");
		super.setPrix(kart.getPrix() + 2); 
		super.setImmatriculation(kart.getImmatriculation());
	}
	
	

}
