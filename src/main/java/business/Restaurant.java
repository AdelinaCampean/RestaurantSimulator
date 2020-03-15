package business;

import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Observable;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import data.RestaurantSerializator;
import presentation.Controller;
import presentation.Interfaces;

public class Restaurant extends Observable implements RestaurantProcessing {
	
	public ArrayList<MenuItem> items = new ArrayList<MenuItem>();
	
	public  HashMap< Order, ArrayList<MenuItem>> productorder = new HashMap <Order, ArrayList<MenuItem>>();

	private RestaurantSerializator rs = new RestaurantSerializator();

	String in = new String();
	String str = new String();

	
	public Interfaces myI;
	
	
	public Restaurant() {
		super();
	}

	public void addProduct(MenuItem m1) {
		items.add(m1);
	}
	
	public void deleteProduct(int id) {
		int k=0;
		while(k<items.size())	
		{
			if(items.get(k).getId()==id)
			{
				items.remove(items.get(k));
			}
			k++;
		}
		
		
			}
	
	public MenuItem editProductName(MenuItem m3,String name) {
		m3.setName(name);
		return m3;
	}
	
	public MenuItem editProductPrice(MenuItem m3,int price) {
		m3.setPrice(price);
		return m3;
	}
	
	public void editProduct(int id,String name, int price) {
		
		for(MenuItem m1 : items)
		{	
			m1.computePrice();

			if(m1.getId()==id )
			{
				m1.setName(name);
				m1.setPrice(price);
			}
		}
		
	}
	
	
	public void listRest() {

		for(MenuItem m4 : items)
			{
			System.out.println(m4.ListMenu());
			}
	
	}
	
	public JTable createTable(ArrayList<MenuItem> menu) {
		
		int i=0;
		
		String column[]={"ID","NAME","PRICE","TYPE","INGREDIENTS"};
		Object data[][]=new Object[menu.size()][5];
		for(MenuItem m1 : menu)
		{
			if(m1 instanceof CompositeProduct) {
				
				for(MenuItem m2: ((CompositeProduct) m1).getMenu()) {
					 in =in+ m2.getName()+",";
					
				}
				m1.computePrice();
				 data[i][0] =  m1.getId();
				 data[i][1] = m1.getName();
				 data[i][2] = m1.getPrice();
				 data[i][3] = "Composite Product";
				 data[i][4] = in;
				 i++;
				 in="";
			}
			else if(m1 instanceof BaseProduct){
			
				m1.computePrice();
				data[i][0] =  m1.getId();
				 data[i][1] = m1.getName();
				 data[i][2] = m1.getPrice();
				 data[i][3] = "Base Product";
				 data[i][4] = "-";
				 i++;
			}

		}
		
		 JTable table = new JTable(data, column);
		 in="";
	       
		 return table;
	    }
			    
			  
	
	
	
	public JTable createOrderTable() {
		
		int j=0;
		String column1[]={"ID_ORDER","DATE","No.TABLE","CONTENT"};
		Object data1[][]=new Object[productorder.size()][4];
		String str3 = new String();
		for (Entry<Order, ArrayList<MenuItem>> m1 : productorder.entrySet()) //geeksforgeeks
		{ 
			
			for(MenuItem w: m1.getValue())
			 {
				 str3 = str3 + w.getName()+", ";
			 }
			
			 data1[j][0] = m1.getKey().orderID;
			 data1[j][1] = m1.getKey().date;
			 data1[j][2] = m1.getKey().table;
			 data1[j][3] = str3;		 
			 j++;
			 str3=new String();
		}
		 JTable tab = new JTable(data1, column1);
			str3="";

		return tab;
	}

	public ArrayList<MenuItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<MenuItem> items) {
		this.items = items;
	}
	
	
}
