package pack4;

public class Car {
	private String name;
	private int numberOfWheels;
	private String color;
	
	public Car(String name, int numberOfWheels, String color) {
		this.name = name;
		this.numberOfWheels =numberOfWheels;
		this.color =color;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car[name=" + name + ",numberOfWheels = "+ numberOfWheels +", color = "+ color +" ]";
	}
}
