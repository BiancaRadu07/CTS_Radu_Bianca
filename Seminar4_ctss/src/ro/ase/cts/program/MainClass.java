package ro.ase.cts.program;

import ro.ase.cts.singletone.AsigurareMedicala;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsigurareMedicala asigurareMedicala = AsigurareMedicala.getInstance();
		AsigurareMedicala asigurareMedicala2 = AsigurareMedicala.getInstance();
		
		asigurareMedicala.setId(2);
		asigurareMedicala.setContributie(212.4f);
		
		System.out.println(asigurareMedicala.toString());
		System.out.println(asigurareMedicala2.toString());
		
		
		//lazy
		ro.ase.cts.singletone.lazy.AsigurareMedicala asigurareLazy1=ro.ase.cts.singletone.lazy.AsigurareMedicala.getInstance(100, "Bianca Radu", 733.2f);
		ro.ase.cts.singletone.lazy.AsigurareMedicala asigurareLazy2=ro.ase.cts.singletone.lazy.AsigurareMedicala.getInstance(100, "Bianca 3", 800.2f);
		
		System.out.println(asigurareLazy1.toString());
		System.out.println(asigurareLazy2.toString());
		
	}

}
