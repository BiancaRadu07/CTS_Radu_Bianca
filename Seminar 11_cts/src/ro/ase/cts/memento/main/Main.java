package ro.ase.cts.memento.main;

import ro.ase.cts.memento.clase.ManagerMeci;
import ro.ase.cts.memento.clase.Memento;
import ro.ase.cts.memento.clase.Originator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Originator meci=new Originator(200, "Dinamo", "Steaua", 200, 30);
		
		Memento memento=meci.creeazaMemento();
		ManagerMeci manager=new ManagerMeci();
		manager.adaugaMemento(memento);
		
		meci.setEchipaAdversar("romania");
		meci.setEchipaGazda("spania");
		meci.setNrSpectatori(290);
		manager.adaugaMemento(meci.creeazaMemento());
		System.out.println(meci.toString());
		meci.setMemento(manager.getMemento(0));
		System.out.println(meci.toString());
	}

}
