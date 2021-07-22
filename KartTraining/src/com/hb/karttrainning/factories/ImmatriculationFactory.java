package com.hb.karttrainning.factories;

import java.util.Random;

public class ImmatriculationFactory {
	
	private static ImmatriculationFactory instance = null;
	
	public static ImmatriculationFactory getInstance() {
		if (ImmatriculationFactory.instance == null) {
			synchronized (ImmatriculationFactory.class) {
				if (ImmatriculationFactory.instance == null) {
					ImmatriculationFactory.instance = new ImmatriculationFactory();
				}
			}
		}
		return ImmatriculationFactory.instance;
	}
	
	
	public String getImmatriculation() {
		//genere aleatoirement l'immat (2chiffres + 2lettres)
		String immat = "";
		Random random = new Random();
		
		int nb = random.nextInt(99) +1;
		
		immat = String.format("%02d" , nb);
		immat += "-";
		
		char lettre1 = (char)(random.nextInt(90 - 65) + 65);
		char lettre2 = (char)(random.nextInt(90 - 65) + 65);
		
		immat += lettre1;
		immat +=lettre2;
		
		return immat;
	}


}
