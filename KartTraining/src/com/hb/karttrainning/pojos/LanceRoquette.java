package com.hb.karttrainning.pojos;

public class LanceRoquette extends KartDecorator{

	public LanceRoquette(Kart kart) {
		super(kart);
		
		super.setNom(kart.getNom() + ", Lance Roquette");
		this.setPrix(kart.getPrix() + 4);
		this.setImmatriculation(kart.getImmatriculation());
		
	}

}
