package com.hb.karttraining.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.hb.karttrainning.pojos.Client;

public class CollectionDeClients implements Iterator<Client>, Iterable<Client>{
	
	private List<Client> clients = new ArrayList<Client>();
	private int offset = 0;
	
	
	@Override
	public Iterator<Client> iterator() {
		// TODO Auto-generated method stub
		return clients.iterator();
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return offset < clients.size();
	}
	@Override
	public Client next() {
		// TODO Auto-generated method stub
		return clients.get(offset++);
	}
	
	public void add(Client client) {
		clients.add(client);
	}
	
	public int size() {
		return clients.size();
	}
	
	public Client get(int offset) {
		return clients.get(offset);
	}
	
	

}
