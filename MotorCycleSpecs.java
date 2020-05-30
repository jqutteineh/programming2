package objectOriented.example;

// this is a class that inherits the CarSpecs class with minor a minor add and change to the price calculator
public class MotorCycleSpecs extends CarSpecs {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public double calculatePrice() {
		double carPriceAfterTaxes = getOriginalPrice() + getWeight() * 5 / 100 + getEngineSize() * 15 / 100;
		return super.calculatePrice();
	}

}
