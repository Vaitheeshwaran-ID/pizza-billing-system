
public class main {

	public static void Main(String[] args) {
		boolean veg;
		pizza basepizza=new pizza(true);
		deluxepizza dp=new deluxepizza(true);
		
		
		basepizza.addextracheese();
		basepizza.addextratoppings();
		basepizza.takeaway();
		basepizza.getbill();
		
		System.out.println("-----------------");
		dp.getbill();
		

	}

}

