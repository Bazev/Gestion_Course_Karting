package com.hb.karttrainning.pojos;

public class Boomerang extends KartDecorator{

	public Boomerang(Kart kart) {
		super(kart);
		
		super.setNom(kart.getNom() + " ,Boomerang");
		super.setPrix(kart.getPrix() + 2);
		super.setImmatriculation(kart.getImmatriculation());
	}
	

}
