package ro.ase.cts.facade.clase;

public class Medic {

	public static boolean trebuieInternat(Pacient pacient){
        return pacient.getGradSeveritate()>5;
    }
}
