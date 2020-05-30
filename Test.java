package objectOriented.example;

public class Test {

	public static void main(String[] args) {

		CarSpecs car = new CarSpecs();
		car.setColour("red");
		car.setEngineSize(1600);
		car.setHorsePower(200);
		car.setMaxSpeed(200);
		car.setName("Kia Optima");
		car.setWeight(3500);
		car.setOriginalPrice(12_000);

		double carPriceAfterTaxes = car.calculatePrice();
		System.out.println("car total price is " + carPriceAfterTaxes);

		MotorCycleSpecs mc = new MotorCycleSpecs();
		mc.setColour("black");
		mc.setAge(22);
		mc.setEngineSize(1000);
		mc.setHorsePower(150);
		mc.setMaxSpeed(160);
		mc.setOriginalPrice(4000);
		mc.setWeight(1100);
		System.out.println("motorcycle total price is " + mc.calculatePrice());
	}
}