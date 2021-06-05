package ro.ase.cts.facade.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Pacient;
import ro.ase.cts.facade.clase.Salon;

public class Main {

	public static void main(String[] args) {
        Pacient pacient= new Pacient("Mihai", 6,2);
        List<Integer> paturiLibere = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> paturiOcupate = new ArrayList<>(Arrays.asList(4,5,6));

        Salon salon= new Salon(paturiLibere,paturiOcupate);
        
        if(Facade.internamPacientul(pacient,salon)){
            System.out.println("Pacientul "+pacient.getNume() +" a fost internat in patul cu nr "+pacient.getCod());
            salon.ocupaPat(pacient.getCod());
        }
        else{
            System.out.println("Pacientul nu trebuie internat");
        }
        
        Pacient pacient2= new Pacient("Dorel", 3,2);
        if(Facade.internamPacientul(pacient2,salon)){
            System.out.println("Pacientul "+pacient2.getNume() +" a fost internat in patul cu nr "+pacient2.getCod());
            salon.ocupaPat(pacient.getCod());
        }
        else{
            System.out.println("Pacientul nu trebuie internat");
        }

	}

}
