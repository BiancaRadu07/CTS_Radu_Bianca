package ro.ase.cts.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.teste.TesteConstructorGrupa;
import ro.ase.cts.teste.TestePromovabilitateGrupa;
import ro.ase.cts.teste.TestePromovabilitateGrupaCuDubluri;
import ro.ase.cts.teste.TestePromovabilitateGrupaWithFixture;

@RunWith(Categories.class)
@SuiteClasses({TesteConstructorGrupa.class,TestePromovabilitateGrupa.class,TestePromovabilitateGrupaCuDubluri.class,TestePromovabilitateGrupaWithFixture.class})
@IncludeCategory(PromovabilitateCategory.class)
@ExcludeCategory(UrgentTestCategory.class)
public class SuitaCustom {

}
