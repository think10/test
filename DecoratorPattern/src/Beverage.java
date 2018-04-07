public abstract class Beverage{
	 String description = "Unknown Beverage";
	 static int VENTI = 0;	 
	 static int TALL = 1;
	 static int GRANDE = 2;

	 int size = 1;
	
	
	public String getDescription() {
		return description;
	}
	public abstract double cost();
	
	//Size addition test
	public void setSize(int in_size) {
		this.size = in_size;
	};
	
	public int getSize() {
		return size;
	}
}