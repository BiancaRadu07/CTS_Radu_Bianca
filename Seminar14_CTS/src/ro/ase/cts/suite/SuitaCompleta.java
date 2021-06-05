package ro.ase.cts.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.teste.TesteConstructorGrupa;
import ro.ase.cts.teste.TestePromovabilitateGrupa;
import ro.ase.cts.teste.TestePromovabilitateGrupaCuDubluri;
import ro.ase.cts.teste.TestePromovabilitateGrupaWithFixture;

@RunWith(Suite.class)
@SuiteClasses({ TesteConstructorGrupa.class, TestePromovabilitateGrupa.class, TestePromovabilitateGrupaCuDubluri.class,TestePromovabilitateGrupaWithFixture.class })
public class SuitaCompleta {

}
