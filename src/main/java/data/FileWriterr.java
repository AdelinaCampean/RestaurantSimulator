package data;

import java.io.FileWriter;
import java.util.ArrayList;

import business.MenuItem;

public class FileWriterr {
	
	public void writeIn(ArrayList<MenuItem> m2, int idor)
	{
		int pricetot=0;
	try{    
        FileWriter fw=new FileWriter("bill.txt");   
        fw.write("FACTURA! "+"\r\n");    
        fw.write("\r\n");
        fw.write("ID COMANDA: ");    
        fw.write(idor+"\r\n");

        for(MenuItem mp : m2)
        {
        	fw.write("Produsul: "+ mp.getName()+ " avand pretul: "+ mp.getPrice()+"\r\n");
        	mp.computePrice();
        	pricetot+=mp.getPrice();
        }
        
        fw.write("Suma totala a comenzii este: "+pricetot);
        fw.close();    
       }
	catch(Exception e){
		System.out.println(e);
		}    
       System.out.println("Factura generata cu succes!"); 
	
}
	
}
