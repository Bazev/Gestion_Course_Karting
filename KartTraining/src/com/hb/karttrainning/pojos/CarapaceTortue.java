package com.hb.karttrainning.pojos;

public class CarapaceTortue extends KartDecorator{

	public CarapaceTortue(Kart kart) {
		super(kart);
		super.setNom(kart.getNom() + ", Carapace de tortue");
		super.setPrix(kart.getPrix() + 3);
		super.setImmatriculation(kart.getImmatriculation());
	}
	

}
