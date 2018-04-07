public class Whip extends CondimentDecorator{
	Beverage beverage;
	public Whip(Beverage bev) {
		this.beverage = bev;
	}
	public String getDescription() {
		return beverage.getDescription()+ ", Whip";
	}
	public double cost() {
		return beverage.cost() + .10;
	}
//	@Override
//	public int getSize() {
//		// TODO Auto-generated method stub
//		return beverage.getSize();
//	}
}