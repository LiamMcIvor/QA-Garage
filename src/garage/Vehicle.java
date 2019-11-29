package garage;

public abstract class Vehicle {
	private int noOfDoors;
	private int noOfWheels;
	private int speed;
	private String registration;
	private int noOfGears;
	
	public int getNoOfDoors() {
		return noOfDoors;
	}
	
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	public int getNoOfWheels() {
		return noOfWheels;
	}
	
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getRegistration() {
		return registration;
	}
	
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	
	public int getNoOfGears() {
		return noOfGears;
	}
	public void setNoOfGears(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
}
