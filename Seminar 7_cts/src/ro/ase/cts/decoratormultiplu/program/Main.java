package ro.ase.cts.decoratormultiplu.program;

import ro.ase.cts.decoratormultiplu.Bilet;
import ro.ase.cts.decoratormultiplu.DecoratorAbstract;
import ro.ase.cts.decoratormultiplu.DecoratorSustinereEchipa;
import ro.ase.cts.decoratormultiplu.DecoratorUrare;

public class Main {

	public static void main(String[] args) {
		
		Bilet bilet = new Bilet("Steaua", "Rapid");
		bilet.rezervaBilet();
		
		DecoratorAbstract meciInGhencea = new DecoratorSustinereEchipa(bilet);
		meciInGhencea.rezervaBilet();
		
		DecoratorAbstract meciDePaste = new DecoratorUrare(bilet);
		meciDePaste.rezervaBilet();
		
		DecoratorAbstract meciInGhenceaDePaste = new DecoratorSustinereEchipa(meciDePaste);
		System.out.println();
		meciInGhenceaDePaste.rezervaBilet();

	}

}
