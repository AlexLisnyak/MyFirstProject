package Lesson04;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Comparator<Dog> d = new Comparator<Dog>() {

			@Override
			public int compare(Dog o1, Dog o2) {
				return o2.getAge()<o1.getAge()?1:-1;
			}
			
		};
		
		//TreeSet<Dog> dogs = new TreeSet<>(new DogComp());
		//TreeSet<Dog> dogs = new TreeSet<>();
		
		TreeSet<Dog> dogs = new TreeSet<>((o1,o2)->o2.getAge()<o1.getAge()?1:-1);
		dogs.add(new Dog("A", 5));
		dogs.add(new Dog("A", 2));
		dogs.add(new Dog("A", 9));
		System.out.println(dogs);
	}

}
