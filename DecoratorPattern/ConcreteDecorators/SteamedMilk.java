public class SteamedMilk extends CondimentDecorator {
	Beverage beverage;
	public SteamedMilk(Beverage bev) {
		this.beverage = bev;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}
	public double cost() {
		return beverage.cost() + .10;
	}
//	@Override
//	public int getSize() {
//		// TODO Auto-generated method stub
//		return beverage.getSize();
//	}
//	
}