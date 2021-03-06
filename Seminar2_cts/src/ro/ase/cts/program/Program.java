package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.reader.ReaderAplicant;
import ro.ase.cts.reader.ReaderStudent;

public class Program {
	
	public static List<Aplicant> citireAplicanti(String fisier, ReaderAplicant reader) throws FileNotFoundException {
		return reader.readAplicanti(fisier);
	}

	public static void main(String[] args) {
		List<Aplicant> lista;
		try {
			lista = citireAplicanti("elevi.txt",new ReaderStudent());
			for(Aplicant a:lista)
				System.out.println(a.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
