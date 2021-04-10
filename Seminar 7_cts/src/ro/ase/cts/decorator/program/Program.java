package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorContactless;
import ro.ase.cts.decorator.clase.DecoratorContactlessTelefon;

public class Program {
	public static void main(String[] args) {
		Card card=new Card("Bia", "12000");
		card.platesteOnline();
		card.platestePOS();
		DecoratorAbstract decoratorContactless = new DecoratorContactless(card);
		decoratorContactless.platesteContactless();
		decoratorContactless.platesteOnline();
		decoratorContactless.platestePOS();
		DecoratorAbstract decoratorContactlessTelefon=new DecoratorContactlessTelefon(card);
		decoratorContactlessTelefon.platesteContactless();
		DecoratorAbstract decoratorAbstract = new DecoratorContactlessTelefon(decoratorContactless);
	}
}
