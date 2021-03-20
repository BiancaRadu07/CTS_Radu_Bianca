package ro.ase.cts.singletone.lazy;

public class AsigurareMedicala {
	private int id;
	private String numeAsigurat;
	private float contributie;
	
	//1-instanta
	//null pt ca aman
	//singleton-constructorul sa fie apelat o singura data
	private static AsigurareMedicala asigurareMedicala = null;
	
	//2-constructorul treb sa fie privat
	private AsigurareMedicala(int id, String numeAsigurat, float contributie) {
		super();
		this.id = id;
		this.numeAsigurat = numeAsigurat;
		this.contributie = contributie;
		
	}
	
	//3-getInstance
	//folosim synchronized
	public static synchronized AsigurareMedicala getInstance(int id, String numeAsigurat, float contributie) {
		if(asigurareMedicala==null) {
			asigurareMedicala=new AsigurareMedicala(id,numeAsigurat,contributie);
		}
		return asigurareMedicala;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumeAsigurat() {
		return numeAsigurat;
	}
	public void setNumeAsigurat(String numeAsigurat) {
		this.numeAsigurat = numeAsigurat;
	}
	public float getContributie() {
		return contributie;
	}
	public void setContributie(float contributie) {
		this.contributie = contributie;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AsigurareMedicala [id=");
		builder.append(id);
		builder.append(", numeAsigurat=");
		builder.append(numeAsigurat);
		builder.append(", contributie=");
		builder.append(contributie);
		builder.append("]");
		return builder.toString();
	}

	
}
