package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		ManagerSala manager=new ManagerSala("Sala sporturilor");
		
		ClientAbonat client1=new ClientAbonat("Bianca");
		ClientAbonat client2=new ClientAbonat("Ana");
		ClientAbonat client3=new ClientAbonat("Alex");
		manager.aboneaza(client1);
		manager.aboneaza(client2);
		manager.aboneaza(client3);
		manager.anuntaMeci("fotbal");
		manager.dezaboneaza(client3);
		manager.anuntaMeci("handbal");

	}

}
