package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.AbstractPrototype;
import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ClientStadion;

public class Main {
	
	public static void main(String[] args) {
		AbstractPrototype abstractPrototype = new ClientStadion("Bianca", 21);
		AbstractPrototype abstractPrototype2 = abstractPrototype.copiaza();
		ClientStadion clientStadion = (ClientStadion) abstractPrototype.copiaza();
		clientStadion.setDenumire("Ana");
		System.out.println(abstractPrototype.toString());
		System.out.println(abstractPrototype2.toString());
		System.out.println(clientStadion.toString());
		
		Bilet bilet = new Bilet(1, "Romania", "Ungaria", "27 martie, 20:00");
		Bilet bilet2 = (Bilet) bilet.copiaza();
		bilet2.setCod(10);
		System.out.println(bilet.toString());
		System.out.println(bilet2.toString());
	}

}
