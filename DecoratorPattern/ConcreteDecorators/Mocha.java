public class Mocha extends CondimentDecorator{
	
	Beverage beverage;// an instance variable to hold beverage we are wrapping. doing this to get parent data? 
	public Mocha(Beverage bev) {
		this.beverage = bev;
	}
	
	public String getDescription() {
		return beverage.getDescription()+", Mocha";
	}
//	@Override
//	public int getSize() {
//		// TODO Auto-generated method stub
//		return size;
//	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}


	
	

}
