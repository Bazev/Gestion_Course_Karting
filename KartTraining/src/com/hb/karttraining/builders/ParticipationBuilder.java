package com.hb.karttraining.builders;

import com.hb.karttrainning.pojos.Client;
import com.hb.karttrainning.pojos.Kart;
import com.hb.karttrainning.pojos.Participation;
import com.hb.karttrainning.pojos.Repas;

public class ParticipationBuilder {
	
	private Participation participation = null;
	public ParticipationBuilder() {
		
		participation = new Participation();
		
	}
	
	public ParticipationBuilder definirClient(Client client) {
		participation.setClient(client);
		return this;
		
	}
	public ParticipationBuilder definirKart(Kart kart) {
		participation.setKart(kart);
		return this;
	}
	public ParticipationBuilder definirRepas(Repas repas) {
		participation.setRepas(repas);
		return this;
	}
	
	public Participation build() {
		
		return participation;
	}
}
