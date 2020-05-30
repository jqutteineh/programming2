package objectOriented.example;

//this class works on OOP concept in which we have the car specs with stters/getters with a method that calculates car price after taxes.

public class CarSpecs {

	private int maxSpeed;
	private int horsePower;
	private double weight;
	private double engineSize;
	private int originalPrice;
	private String colour;
	private String name;

	public double calculatePrice() {

		double carPriceAfterTaxes = originalPrice + weight * 5 / 100 + engineSize * 5 / 100; // this equation is just an
																								// example, dont know
																								// what the real
																								// equation is.
		return carPriceAfterTaxes;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed < 220) {
			this.maxSpeed = maxSpeed;
		} else
			System.out.println("max speed is't allowed");
	}

	public int getHorsePower() {

		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		if (horsePower < 450) {
			this.horsePower = horsePower;
		} else
			System.out.println("horse power is't allowed");
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	public int getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
