package collection;

public class Cat implements Sound {
	

	int Id;
	
	

	public Cat(int id) {
		super();
		Id = id;
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	@Override
	public void MakeSound() {

		System.out.println("🐈");
	}

}
