public class Soy extends CondimentDecorator{
	Beverage beverage;
	public Soy(Beverage bev) {
		this.beverage = bev;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	public double cost() {
		double cost = beverage.cost();
		int size = getSize();
		if(size==Beverage.TALL) {
			cost +=.10;
		}else if(size == Beverage.GRANDE) {
			cost +=.15;
		}else if(size == Beverage.VENTI) {
			cost +=.20;
		};
		return cost + .15;
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}
}