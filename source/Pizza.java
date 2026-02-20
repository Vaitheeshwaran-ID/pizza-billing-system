
public class Pizza {
private int price;
private Boolean veg;

private int backpack=20;
private int extracheeseprice=100;
private int extratoppingprice=150;


private boolean isextracheeseadded=false;
private boolean isextratoppingsadded=false;
private boolean isoptedfortakeaway=false;




public pizza(Boolean veg) {
	this.veg=veg;
	
if(this.veg) {
	this.price=300;
}
else {
	this.price=400;
}

}


public void addextracheese() {
	isextracheeseadded=true;
	this.price+=extracheeseprice;
}

public void addextratoppings() {
	isextratoppingsadded=true;
	this.price+=extratoppingprice;
}

public void takeaway() {
	isoptedfortakeaway=true;
this.price+=backpack;
}


public void getbill() {
	
	System.out.println("Base Price:"+price);

	if(isextracheeseadded) {
		System.out.println("Extra cheese added:"+ extracheeseprice);

	}
	
	if(isextratoppingsadded) {
				System.out.println("Extra toppings added:"+ extratoppingprice);

	}
	
	if(isoptedfortakeaway) {
		System.out.println("backpack price:"+ backpack);

	}
	
	System.out.println(price);
}





}


