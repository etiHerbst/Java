package collection;

public class Person implements Sound{

	int Id;
	double age;
	

	public Person(int id, double age) {
		super();
		Id = id;
		this.age = age;
	}


	public int getId() {
		return Id;
	}






	public void setId(int id) {
		Id = id;
	}


	public double getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public void MakeSound() {
		
		if(age>1)
			System.out.println("👨‍🦰");
		else
			System.out.println("👶");
		
	}

}
