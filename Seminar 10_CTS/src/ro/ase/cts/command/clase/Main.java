package ro.ase.cts.command.clase;

public class Main {

	public static void main(String[] args) {

		ManagerComenzi managerComenzi = new ManagerComenzi(null);
		ContBancar contBancar = new ContBancar("Bianca", 0);
		
		managerComenzi.invocaComanda(new ComandaConstituire(contBancar,50));
		managerComenzi.invocaComanda(new ComandaDepunere(contBancar,30));
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new ComandaRetragere(contBancar,40));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new ComandaRetragere(contBancar,10));
		managerComenzi.executaComanda();
	}

}
