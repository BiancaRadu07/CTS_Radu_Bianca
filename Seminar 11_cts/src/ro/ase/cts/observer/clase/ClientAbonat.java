package ro.ase.cts.observer.clase;

public class ClientAbonat implements Observer {

	private String numeClient;
	
	
	
	public ClientAbonat(String numeClient) {
		super();
		this.numeClient = numeClient;
	}



	@Override
	public void primesteAnunt(String mesaj) {
		System.out.println(this.numeClient+" a primit mesajul "+mesaj);
		
	}

}
