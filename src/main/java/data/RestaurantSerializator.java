package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import business.MenuItem;

public class RestaurantSerializator implements Serializable {

	
	public void serialize(ArrayList<MenuItem> s)
	{
		try {
			FileOutputStream o = new FileOutputStream("info.ser");
			ObjectOutputStream out = new ObjectOutputStream(o);
	         out.writeObject(s);
	         out.close();
	         o.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
		}
		catch (IOException i) {
	         i.printStackTrace();
	      }
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<MenuItem> deserialize() {
		
		try
		{
			FileInputStream i = new FileInputStream("info.ser");
			ObjectInputStream in = new ObjectInputStream(i);
			ArrayList<MenuItem> d = (ArrayList<MenuItem>) in.readObject();
	         in.close();
	         i.close();
	         return d;
		}
		catch (IOException i) {
	         i.printStackTrace();
	         return null;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return null;
	      }
	}

}
