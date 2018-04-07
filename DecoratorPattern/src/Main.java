public class Main {
	public static void main(String[] args) {
		Beverage bev = new Espresso();
		System.out.println(bev.getDescription()+ " $"+ bev.cost());
		
		Beverage bev2 = new DarkRoast();
		bev2 = new Mocha(bev2);
		bev2 = new Mocha(bev2);
		bev2 = new Whip(bev2);		
		System.out.println(bev2.getDescription()+ " $" + bev.cost());
		
		Beverage bev3 = new HouseBlend();
		bev3.size = 1;
		bev3 = new Soy(bev3);
		bev3 = new SteamedMilk(bev3);
		bev3 = new Whip(bev3);
		System.out.println(bev3.getDescription()+ " $"+ bev3.cost());
		
	}
}