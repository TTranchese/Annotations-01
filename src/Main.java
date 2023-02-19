public class Main {
	public static void main(String[] args) {
		Car car = new Car("yaris", 1000);

		@SuppressWarnings("deprecation")
		String carDetails = car.carDetails();
		System.out.println(carDetails);

		car.getCarDetails();
	}
}