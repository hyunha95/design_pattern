package decorator;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "에스프레소";
	}

	public double cost() {
		return .89;
	}
}
