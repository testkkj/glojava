package example.chap11_06_01;

public class Car {
	String model;
	String owner;
	
	Car() {}
	
	Car(String owner) {
		this.owner = owner;		
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
