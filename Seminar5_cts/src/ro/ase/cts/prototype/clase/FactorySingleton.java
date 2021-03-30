package ro.ase.cts.prototype.clase;

import ro.ase.cts.simplefactory.Atacant;
import ro.ase.cts.simplefactory.Fundas;
import ro.ase.cts.simplefactory.Jucator;
import ro.ase.cts.simplefactory.Portar;
import ro.ase.cts.simplefactory.TipJucator;

public class FactorySingleton {
	
	private static FactorySingleton factorySingleton = null;
	
	private FactorySingleton() {
		
	}
	
	public static synchronized FactorySingleton getInstance() {
		if(factorySingleton == null) {
			factorySingleton = new FactorySingleton();
		}
		return factorySingleton;
	}

	public Jucator getJucator(TipJucator tipJucator, String nume, int varsta) {
		switch (tipJucator) {
		case PORTAR:
			return new Portar(nume, varsta);
		case FUNDAS:
			return new Fundas(nume, varsta);
		case ATACANT:
			return new Atacant(nume, varsta);
		default:
			throw new IllegalArgumentException();
		}
	}
}
