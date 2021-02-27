package seminar1;

import clase.Animal;
import clase.Lion;
import clase.WildCat;
import clase.Zoo;

public class Main1 {

	public static void main(String[] args) {
		
		Zoo zoo=new Zoo();
		Animal lion1=new Lion("Leo");
		Lion lion2=new Lion("Leona");
		zoo.addAnimal(lion1);
		zoo.addAnimal(lion2);
		zoo.feedAllAnimals();
		
		WildCat cat=new WildCat("Pisica");
		WildCat cat2=new WildCat("Pisica2", "mancare2");
		
		
		zoo.addAnimal(cat);
		zoo.addAnimal(cat2);
		zoo.feedAllAnimals();
	}

}
