
public class Car {
	private String make;
	private String model;
	private int year;
	private double price; 
	
	//constructor
	public Car (String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	//getters/accessors
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
	
	public double getPrice(){
		return price;
	}

	//setters/mutators
	public void setMake(String make) {
		this.make = make;
	}

	//id is permanent--no mutator
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year){
		this.year = year; 
	}
	
	public void setPrice(double price){
		this.price = price;
	}

}