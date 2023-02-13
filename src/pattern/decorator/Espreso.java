package decorator;

public class Espreso extends Beverage {
	public Espreso() {
		description = "에스프레소";
	}

	public double cost() {
		return 1.99;
	}
}
