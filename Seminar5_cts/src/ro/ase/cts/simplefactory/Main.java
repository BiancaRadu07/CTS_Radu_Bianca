package ro.ase.cts.simplefactory;

public class Main {
	
	public static void main(String[] args) {
		Factory factory = new Factory();
		Jucator portar = factory.getJucator(TipJucator.PORTAR, "Bianca", 21);
		Jucator fundas = factory.getJucator(TipJucator.FUNDAS, "Ana", 22);
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}
}
