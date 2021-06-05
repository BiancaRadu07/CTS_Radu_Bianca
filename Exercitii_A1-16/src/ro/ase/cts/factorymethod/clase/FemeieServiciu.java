package ro.ase.cts.factorymethod.clase;

public class FemeieServiciu extends PersonalSpital{
	
	public FemeieServiciu(String nume, int varsta) {
		super(nume, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FemeieServiciu []");
		builder.append(super.toString());
		return builder.toString();
	}


}
