package business;

import java.io.Serializable;
import java.util.ArrayList;

public class CompositeProduct extends MenuItem implements Serializable {

		ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
	
		public CompositeProduct(int id, String name, int price) {
			super(id, name, price);
		}

		public CompositeProduct() {
			super();
		}

	
		@Override
		public void computePrice() {
			// TODO Auto-generated method stub
			int p=0;
			for(MenuItem m: menu)
			{
					p+=m.getPrice();
			}
			
			super.setPrice(p);
		}

		
		public String ListComp() {
			return "Composite Product"+super.ListMenu();
					}

		public ArrayList<MenuItem> getMenu() {
			return menu;
		}

		public void setMenu(ArrayList<MenuItem> menu) {
			this.menu = menu;
		}

	
		
		
}
