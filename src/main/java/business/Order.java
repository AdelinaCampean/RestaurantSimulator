package business;

import java.util.ArrayList;
import java.util.HashMap;

public class Order {

	public int orderID;
	public String date;
	public int table;
	
	

	public Order(int orderID, String date, int table) {
		super();
		this.orderID = orderID;
		this.date = date;
		this.table = table;
	}
	

	@Override
	public int hashCode() {
		return this.orderID;
	}
	
	

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTableorder() {
		return table;
	}

	public void setTableorder(int table) {
		this.table = table;
	}

	
	
	
}
