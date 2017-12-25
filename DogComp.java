package Lesson04;

import java.util.Comparator;

public class DogComp implements Comparator<Dog>{

	

	@Override
	public int compare(Dog o1, Dog o2) {
		
		return o2.getAge()>o1.getAge()?1:-1;
	}
	
	

}
