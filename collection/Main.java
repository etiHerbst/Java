package collection;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Sound> s=new ArrayList<Sound>();
		Cat c= new Cat(1);
		Dog d= new Dog(2);
		Employee e= new Employee(3, 40);
		Employee e2= new Employee(4, 400000);
		Person p=  new Person(5,0.2);
		Person p2=  new Person(6,22);

      s.add(c);	
      s.add(d);	
      s.add(e);	
      s.add(e2);	
      s.add(p);	
      s.add(p2);
      
      for (Sound s1 : s) {
		
	s1.MakeSound();
		
	}

      
	
	}

}
