package ro.ase.cts.builder.program;

import ro.ase.cts.builder.Rezervare;
import ro.ase.cts.builder.RezervareBuilder;
import ro.ase.cts.builder.RezervareBuilderV2;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare = new Rezervare(1, false, true, true, false, "Jazz");
		System.out.println(rezervare.toString());
		Rezervare rezervare2 = new RezervareBuilder().setCod(10).setBauturaRacoritoareInclusa(true).setMuzicaAmbientalaPersonalizata(true).build();
		System.out.println(rezervare2.toString());
		Rezervare rezervare3 = new RezervareBuilder().setCod(11).setScaunErgonomic(true).build();
		System.out.println(rezervare3.toString());
		Rezervare rezervare4 = new RezervareBuilder(12).setGenMuzica("rock").build();
		System.out.println(rezervare4.toString());
		
		RezervareBuilder builder = new RezervareBuilder();
		Rezervare r1;
		Rezervare r2;
		r1 = builder.setCod(13).setGenMuzica("pop").build();
		r2 = builder.setCod(14).build();
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		RezervareBuilderV2 builder2 = new RezervareBuilderV2().setBauturaRacoritoareInclusa(true);
		Rezervare rezervare5 = builder.setCod(15).build();
		Rezervare rezervare6 = builder.setCod(16).build();
		System.out.println(rezervare5.toString());
		System.out.println(rezervare6.toString());
	}

}
