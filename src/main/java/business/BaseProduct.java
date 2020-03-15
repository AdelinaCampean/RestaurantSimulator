package business;

public class BaseProduct extends MenuItem {
	

	public BaseProduct() {
		
	}


	public BaseProduct(int id, String name, int price) {
		super(id, name, price);
	}
	

	@Override
	public void computePrice() {
		
	}


	
	public String ListBase() {
		return "Base Product"+super.ListMenu();
	}


	
 
}
