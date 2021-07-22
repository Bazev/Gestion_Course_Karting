package com.hb.karttraining.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hb.karttraining.builders.ParticipationBuilder;
import com.hb.karttraining.iterators.CollectionDeClients;
import com.hb.karttrainning.factories.ImmatriculationFactory;
import com.hb.karttrainning.pojos.Banane;
import com.hb.karttrainning.pojos.Boomerang;
import com.hb.karttrainning.pojos.Burger;
import com.hb.karttrainning.pojos.CarapaceTortue;
import com.hb.karttrainning.pojos.Client;
import com.hb.karttrainning.pojos.HotDog;
import com.hb.karttrainning.pojos.Kart;
import com.hb.karttrainning.pojos.KartDecorator;
import com.hb.karttrainning.pojos.Kebab;
import com.hb.karttrainning.pojos.LanceRoquette;
import com.hb.karttrainning.pojos.Participation;
import com.hb.karttrainning.pojos.Repas;
import com.hb.karttrainning.pojos.Salade;
import com.hb.karttrainning.pojos.Sushi;




public class KartMain {
	private static Scanner sc = new Scanner(System.in);
	private static CollectionDeClients collectionDeClients = new CollectionDeClients();
	private static List<Participation> participations = new ArrayList<>();
	private static List<Kart> karts = new ArrayList<>();
	private static List<Repas> repas = new ArrayList<>();
	
	public static void main(String[] args) {
		
		genererKart();
		
		collectionDeClients.add(new Client("Frascone", "Audrey") );
		collectionDeClients.add(new Client("Frascone", "Mani") );
		collectionDeClients.add(new Client("Bazin", "Lucile") );
		
		
		int choix = 0;
		
		while(choix != 6){
			afficherMenuPrincipal();
			choix = saisirChoix("Saisir un choix :");
			
			switch (choix) {
			case 1: ajouterClient();
				break;
			case 2: afficherClients();
				break;
			case 3:ajouterParticipation();
				break;
			case 4:afficherParticipation();
				break;
			case 5 :
				afficherKarts();
				break;
			default:
				break;
			}
		}
		sc.close();	
	}

	public static void afficherMenuPrincipal() {
		System.out.println("Menu Principal");
		System.out.println("1) Ajouter un client");
		System.out.println("2) Voir les clients");
		System.out.println("3) Ajouter une participation");
		System.out.println("4) Voir les participations");
		System.out.println("5) Afficher les karts");
		System.out.println("6) Quitter");
	}
	
	public static int saisirChoix(String text) {
		int choix = 0;
		System.out.println(text);
		try {
			choix = Integer.parseInt(sc.nextLine());
			
		} catch (NumberFormatException e) {
			System.out.println("Veuillez saisir un nombre ! ");
		}
		return choix;
	}
	
	public static void afficherClients() {
		for (Iterator it = collectionDeClients.iterator(); collectionDeClients.hasNext();){
			Client client = collectionDeClients.next();
			
			System.out.println(client);
		}
	}
	
	public static void ajouterClient() {
		System.out.println("Entrez un nom :");
		String nom = sc.nextLine();
		System.out.println("Entrez un prénom :");
		String prenom = sc.nextLine();
		
		Client client = new Client(nom, prenom);
		collectionDeClients.add(client);
	}
	
	public static void ajouterParticipation() {
		
		int idclient = 0;
		Kart karttrouve = null;
		int idoption = 0;
		KartDecorator kartDecorateur = null;
		Repas repas = null;
		ParticipationBuilder participationBuilder = new ParticipationBuilder();
				
		
		if (collectionDeClients.size() > 0) {
			afficherClients();
		idclient = saisirChoix("Veuillez renseigner un numéro de client :");
		
		afficherKarts();
		
		System.out.println("Saisissez une immat :");
		String immat = sc.nextLine();
		
		for (Kart kart : karts) {
			if (kart.getImmatriculation().equals(immat)) {
			karttrouve = kart;
			}
		}
		if (karttrouve != null) {
			
			System.out.println("Voulez-vous ajouter une option (o/n)?");
			String oui = sc.nextLine();
			if (oui.equalsIgnoreCase("o")) {
				afficherOption();
			idoption = saisirChoix("Veuillez renseignez le numéro de l'option");
			}	
	
		switch (idoption) {
		case 1:
			kartDecorateur = new LanceRoquette(karttrouve);
			break;
		case 2 :
			kartDecorateur = new Banane(karttrouve);
			break;
		case 3 :
			kartDecorateur = new CarapaceTortue(karttrouve);
			break;
		case 4 :
			kartDecorateur = new Boomerang(karttrouve);
			break;
		default:
			kartDecorateur = (KartDecorator) karttrouve;
			break;
		}
		
		System.out.println("Choisissez votre repas : ");
		
		
		
	
		
		
		participationBuilder.definirClient(collectionDeClients.get(idclient - 1));
		participationBuilder.definirKart(kartDecorateur);
		
		
		Participation participation = participationBuilder.build();
		
		participations.add(participation);
		
		System.out.println(participation);
		System.out.println("Vous avez ajouté l'option " + kartDecorateur.getNom());
		System.out.println("Prix Total du kart : " + kartDecorateur.getPrix());
		}
		else {
			System.out.println("Le numéro d'immatriculation est incorrect");
			}
		}
		else {
			System.out.println("Il n'y a pas de clients !");
		}
	
		
	}
	public static void afficherParticipation() {
		for (Participation participation : participations) {
			System.out.println(participation);
		}
	}
	
	public static void genererKart() {
		
		for (int i =1; i <=10; i++) {
			Kart kart = new Kart();
			
			kart.setNom("Kart" + i);
			kart.setImmatriculation(ImmatriculationFactory.getInstance().getImmatriculation());
			kart.setPrix(50);
			karts.add(kart);
		}
	}
	
	public static void afficherKarts() {
		for (Kart kart : karts) {
		System.out.println(kart);
		}
	}
	
	public static void afficherOption() {
		System.out.println("1) Lance Roquette");
		System.out.println("2) Banane");
		System.out.println("3) Carapace de tortue");
		System.out.println("4) Boomerang");
		
	}
	
	public static void choixRepas() {
		ParticipationBuilder participationBuilder = new ParticipationBuilder();
		int choix = 0;
		
		System.out.println("1) Hamburger");
		System.out.println("2) HotDog");
		System.out.println("3) Salade");
		System.out.println("4) Kebab");
		System.out.println("5) Sushi");
		
		saisirChoix("Saisissez un repas");
		
		switch (choix) {
		case 1: {
			participationBuilder.definirRepas(new Burger());
			break;
		}
		case 2:
			participationBuilder.definirRepas(new HotDog());
			break;
		case 3 :
			participationBuilder.definirRepas(new Salade());
			break;
		case 4 :
			participationBuilder.definirRepas(new Kebab());
			break;
		case 5 :
			participationBuilder.definirRepas(new Sushi());
			break;
		default:
			
		}
	}
}
