package collection;

public class Employee implements Sound {

	int Id;
	int salery;
	
	
	
	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public int getSalery() {
		return salery;
	}



	public void setSalery(int salery) {
		this.salery = salery;
	}



	public Employee(int id, int salery) {
		super();
		Id = id;
		this.salery = salery;
	}



	@Override
	public void MakeSound() {
		
		if(salery>=10000)
			System.out.println("😄");
		else
			System.out.println("😔😪");

		
	}

}
