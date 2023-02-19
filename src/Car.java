public class Car {
	public String modelName;
	public int mileAge;

	public Car(String modelName, int mileAge) {
		this.modelName = modelName;
		this.mileAge = mileAge;
	}

	@Deprecated
	public String carDetails(){
		return ("Model: "+modelName+" | Mile age: "+mileAge);
	}

	public void getCarDetails(){
		System.out.println("Model: "+modelName+" \nMile age: "+mileAge);
	}
}
