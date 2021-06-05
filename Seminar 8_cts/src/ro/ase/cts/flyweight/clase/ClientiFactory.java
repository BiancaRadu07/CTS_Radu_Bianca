package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class ClientiFactory {
	
	//FlyweightFactory
	
	private Map<String,Client> clienti;
	
	public ClientiFactory() {
		clienti=new HashMap<>();
	}

	public Client getClient(String email) {
		if(clienti.containsKey(email)) {
			return clienti.get(email);
		} else {
			//nu a facut nicio rezervare deci il creem
			Client client=new Client("Bianca",163,email);
			clienti.put(email,client);
			return client;
		}
	}

}
