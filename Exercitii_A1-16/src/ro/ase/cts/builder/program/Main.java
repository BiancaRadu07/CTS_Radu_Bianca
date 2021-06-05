package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Internare;
import ro.ase.cts.builder.clase.InternareBuilder;

public class Main {

	public static void main(String[] args) {

		Internare internare = new Internare(1, false, true, true, false);
		System.out.println(internare.toString());
		Internare internare2 = new InternareBuilder().setCod(10).setPatRabatabil(true).setMicDejun(true).build();
		System.out.println(internare2.toString());
		Internare internare3 = new InternareBuilder().setCod(11).setHalat(true).build();
		System.out.println(internare3.toString());
		Internare internare4 = new InternareBuilder(12).setPapuciDeCamera(false).build();
		System.out.println(internare4.toString());
		
		//shallow copy
		InternareBuilder builder = new InternareBuilder();
		Internare i1;
		Internare i2;
		i1 = builder.setCod(13).setPapuciDeCamera(true).build();
		i2 = builder.setCod(14).build();
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		

	}

}
