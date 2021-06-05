package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Reteta;

public class Main {

	public static void main(String[] args) {
		
		Reteta reteta = new Reteta(1, "Nurofen");
		Reteta reteta2 = (Reteta) reteta.copiaza();
		reteta2.setCod(10);
		System.out.println(reteta.toString());
		System.out.println(reteta2.toString());
	}

}
