public class Deluxepizza extends pizza{

	public deluxepizza(Boolean veg) {
		super(veg);
		super.addextracheese();
		super.addextratoppings();
	}

	@Override
	public void addextracheese() {
		// empty
	}
	@Override
	public void addextratoppings() {
		// empty
	}
}

