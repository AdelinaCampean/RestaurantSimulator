package business;

public interface RestaurantProcessing {

	public void addProduct(MenuItem m1);
	public void deleteProduct(int id);
	public void editProduct(int id,String name, int price);
	
	
}
