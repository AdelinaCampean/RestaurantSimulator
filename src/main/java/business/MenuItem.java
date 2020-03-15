package business;

import java.io.Serializable;

public abstract class MenuItem  implements Serializable {
	
	private int id;
	private String name;
	private int price;
	
	
	public MenuItem(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public MenuItem() {
		
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public String ListMenu() {
		return "MenuItem [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public abstract void computePrice();

}
