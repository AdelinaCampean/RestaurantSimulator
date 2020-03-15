package main;

import java.util.Observer;

import business.BaseProduct;
import business.CompositeProduct;
import business.MenuItem;
import business.Order;
import business.Restaurant;
import presentation.Controller;
import presentation.Interfaces;

public class Main {

	public static void main(String[] args)
	{
	Restaurant r = new Restaurant();
	/*MenuItem m1 = new CompositeProduct(1,"pizza",18);
	MenuItem m2 = new CompositeProduct(2,"crispy",5);
	MenuItem m3 = new CompositeProduct(3,"paste",5);
	MenuItem m4 = new CompositeProduct(4,"supa",5);
	MenuItem m5 = new BaseProduct(1,"branza",5);
	MenuItem m6 = new BaseProduct(1,"ardei",5);
	MenuItem m7 = new BaseProduct(1,"pui",5);
	MenuItem m8 = new BaseProduct(1,"cartofi",5);

	Order o1 = new Order(1,"12.05.2019",2);
	
	r.addProduct(m1);
	r.addProduct(m2);
	r.addProduct(m3);
	r.addProduct(m4);
	r.addProduct(m5);
	r.addProduct(m6);
	r.addProduct(m7);
	r.addProduct(m8);

	r.listRest();*/
	
	Interfaces i = new Interfaces();
	
	Controller c = new Controller(i,r);
	
	c.addObserver(i);
	/*public void addOrder(MenuItem mw){
		o1.addProduct(mw);
	}*/
	
	}
}
