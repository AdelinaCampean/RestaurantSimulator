package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import business.BaseProduct;
import business.CompositeProduct;
import business.MenuItem;
import business.Order;
import business.Restaurant;
import data.FileWriterr;
import data.RestaurantSerializator;
import java.util.Scanner; 




public class Controller extends Observable {
	
		public Interfaces myI;
		public Restaurant res;
		private MenuItem compo;
		private int val=1;
		private int valc=1;
		private int verif=0;
		private int ido=1;
		private Order o;
		private ArrayList<MenuItem> a;
		private  HashMap< Order, ArrayList<MenuItem>> productorder1 = new  HashMap <Order, ArrayList<MenuItem>>();
		
		public Controller(Interfaces myI,Restaurant r) {
			super();
			RestaurantSerializator rs = new RestaurantSerializator();
			this.myI = myI;
			this.res = r;
			myI.addListenerButon1(new adm());
			myI.addListenerButon2(new wa());
			myI.addListenerButon3(new chef());
			myI.addListenerButon4(new delete());
			myI.addListenerButon5(new viz());
			myI.addListenerButon6(new add());
			myI.addListenerButon7(new edit());
			myI.addListenerButon8(new newo());
			myI.addListenerButon9(new comp());
			myI.addListenerButon10(new gen());
			myI.addListenerButon11(new tableview());
			myI.addListenerButon12(new done());
			myI.addListenerButon13(new addd());
			myI.addListenerButon14(new end());
			a = new ArrayList<MenuItem>();
			res.items = rs.deserialize();  //decodificam informatiile, pentru a actualiza tabelul
	
		
		}
		
		class adm implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {

				try {
				myI.frameadm();
				myI.getFramea().setVisible(true);

				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
					
			}
		}
		
		class chef implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {

				try {
				myI.framechef();
				myI.getFramechef().setVisible(true);
				
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		
		class wa implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {

				try {
				myI.framew();
				myI.getFramew().setVisible(true);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
					
			}
		}
		
		
		class end implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {

				try {
					RestaurantSerializator rw = new RestaurantSerializator();
					rw.serialize(res.items); 
					

				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
					
			}
		}
		
		class delete implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if((!(myI.getB().isEmpty()) && !(myI.getNum().isEmpty()) && !(myI.getPrie().isEmpty()) )    &&     ((myI.getId2().isEmpty())&&(myI.getNum2().isEmpty())&&(myI.getPri2().isEmpty()) )  )// &&   ((myI.getId2()=="")&&(myI.getNum2()=="")&&(myI.getPri2()==""))) //adaugarea unui base product 
					{
						assert( Integer.parseInt(myI.getB())>0) : "Produsul nu exista!" ;
						res.deleteProduct(Integer.parseInt(myI.getB()));
						
					}
					else if (!(myI.getId2().isEmpty())&&!(myI.getNum2().isEmpty())&&!(myI.getPri2().isEmpty())    &&     (myI.getB().isEmpty()) && (myI.getNum().isEmpty()) && (myI.getPrie().isEmpty()))// &&    ((myI.getB()=="") && (myI.getNum()=="") && (myI.getPrie()==""))) //adaugarea unui composite product 
					{
						
						res.deleteProduct(Integer.parseInt(myI.getId2()));
					
					}
					
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		
		class viz implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {

			try {
				myI.frametaba();
				res.listRest();

				 JTable table = res.createTable(res.items);
				 myI.getFrametab().add(new JScrollPane(table));
				
		         
				
			}
			catch(Exception ex) {
					ex.printStackTrace();
				}			
			}
		}
		
		class add implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {

				try {
					assert myI.getB().isEmpty()  : "Id este gol";
					assert myI.getNum().isEmpty() : "Numele esye gol";
					assert myI.getPrie().isEmpty() : "Pretul este gol ";
					if((!(myI.getB().isEmpty()) && !(myI.getNum().isEmpty()) && !(myI.getPrie().isEmpty()) )    &&     ((myI.getId2().isEmpty())&&(myI.getNum2().isEmpty())&&(myI.getPri2().isEmpty()) )  )// &&   ((myI.getId2()=="")&&(myI.getNum2()=="")&&(myI.getPri2()==""))) //adaugarea unui base product 
					{				//System.out.println("aaa");

						MenuItem base = new BaseProduct(Integer.parseInt(myI.getB()),myI.getNum(),Integer.parseInt(myI.getPrie()));
						
						if(myI.getMessage().equals("Introduceti produsele necesare pentru obtinerea produsului!"))
						{
					
								MenuItem base2 = new BaseProduct(Integer.parseInt(myI.getB()),myI.getNum(),Integer.parseInt(myI.getPrie()));
									
								((CompositeProduct) compo).getMenu().add(base);
								
								//res.items.add(base);
							
						}
						else 
							
							res.items.add(base);

						//System.out.println(((BaseProduct) base).ListBase());

					}
					else if (!(myI.getId2().isEmpty())&&!(myI.getNum2().isEmpty())&&!(myI.getPri2().isEmpty())    &&     (myI.getB().isEmpty()) && (myI.getNum().isEmpty()) && (myI.getPrie().isEmpty()))// &&    ((myI.getB()=="") && (myI.getNum()=="") && (myI.getPrie()==""))) //adaugarea unui composite product 
					{
						//System.out.println("v1"+verif);
						if(verif==0)
						{
							compo = new CompositeProduct(Integer.parseInt(myI.getId2()),myI.getNum2(),Integer.parseInt(myI.getPri2()));
							((CompositeProduct) compo).setMenu(new ArrayList<MenuItem>());							
							
							myI.setMessage("Introduceti produsele necesare pentru obtinerea produsului!");
							
							//System.out.println(myI.getId2()+myI.getNum2()+Integer.parseInt(myI.getPri2()));
							
							verif=1;
						}
						else if(verif==1)
						{
					

								CompositeProduct compo2 = new CompositeProduct(Integer.parseInt(myI.getId2()),myI.getNum2(),Integer.parseInt(myI.getPri2()));
								((CompositeProduct) compo).getMenu().add(compo2);
								//res.items.add(compo2);
						} 
							
					}
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
					
			}
		}
		
		
		class edit implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {

				try {
					
					if((!(myI.getB().isEmpty()) && !(myI.getNum().isEmpty()) && !(myI.getPrie().isEmpty()) )    &&     ((myI.getId2().isEmpty())&&(myI.getNum2().isEmpty())&&(myI.getPri2().isEmpty()) )  )// &&   ((myI.getId2()=="")&&(myI.getNum2()=="")&&(myI.getPri2()==""))) //adaugarea unui base product 
					{
						res.editProduct(Integer.parseInt(myI.getB()), myI.getNum(), Integer.parseInt(myI.getPrie()));
						
						

					}
					else if (!(myI.getId2().isEmpty())&&!(myI.getNum2().isEmpty())&&!(myI.getPri2().isEmpty())    &&    ( (myI.getB().isEmpty()) && (myI.getNum().isEmpty()) && (myI.getPrie().isEmpty())))// &&    ((myI.getB()=="") && (myI.getNum()=="") && (myI.getPrie()==""))) //adaugarea unui composite product 
					{
						res.editProduct(Integer.parseInt(myI.getId2()), myI.getNum2(), Integer.parseInt(myI.getPri2()));
						//System.out.println(compo.ListMenu());
					}
				
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
					
			}
		}
		
		
		class done implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {

				try {
				
					myI.setMessage("");	
					compo.computePrice();
					for(MenuItem m:((CompositeProduct) compo).getMenu())
					{
						System.out.println(m.ListMenu());
					}
					res.items.add(compo);
					verif=0;
					
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
					
			}
		}
		

		class newo implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {

				try {
					o = new Order(ido,myI.getDatat(),Integer.parseInt(myI.getTablet()));
					ido++;
					res.productorder.put(o,a);
					a = new ArrayList<MenuItem>();
					setChanged();
					notifyObservers();  //aceasta metoda apeleaza metoda de update din fiecare observator, respectiv din interfata chef, care trebuie notificata
					//myI.framechef();
					

				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
					
			}
		}
		
		class comp implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				
				int tt = 0;
				try {
					
					for(MenuItem mp : a)
			        {
			        	mp.computePrice();
			        	tt+=mp.getPrice();
			        }
					System.out.println("SUMA TOTALA ESTE: "+tt);
				
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
					
			}
		}
		
		class gen implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {

				try {
				FileWriterr f = new FileWriterr();
				f.writeIn(a,ido);
				
			

				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
					
			}
		}
		
		class tableview implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {

				try {
				
					myI.frametabo();
					JTable tabl = res.createOrderTable();
					 myI.getFrametabo().add(new JScrollPane(tabl));
						//a.clear();

				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
					
			}
		}
		
		class addd implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {

				try {
				
					for(MenuItem men: res.items)
					{
						if(men.getId()==Integer.parseInt(myI.getIdt()))
						{
							a.add(men);
						}
						
					}
					
					
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
					
			}
		}
}
