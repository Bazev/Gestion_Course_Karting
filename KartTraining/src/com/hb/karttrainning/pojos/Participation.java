package com.hb.karttrainning.pojos;

public class Participation {
	
	private static int inc = 1;
	
	private int id;
	private Client client;
	private Kart kart;
	private Repas repas;
	
	public Participation() {	
	}
	public Participation(Client client, Kart kart, Repas repas) {
		super();
		this.id = inc++;
		this.client = client;
		this.kart = kart;
		this.repas = repas;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void generateid() {
		inc++;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Kart getKart() {
		return kart;
	}
	public void setKart(Kart kart) {
		this.kart = kart;
	}
	public Repas getRepas() {
		return repas;
	}
	public void setRepas(Repas repas) {
		this.repas = repas;
	}
	


	@Override
	public String toString() {
		return "Participation [id=" + id + ", client=" + client + ", kart=" + kart + ", repas=" + repas + "]";
	}
	
	
	
	

}
