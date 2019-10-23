package corejava.Collections;

import java.util.Hashtable;
import java.util.Set;

public class HasMap_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 *  Hash accept objects to store using key and value
		 *  It only accept pair values to store..
		 *  	=> Hashset is a sorted list of set.
		 */
		
		Hashtable<Integer, String> hash=new Hashtable<Integer,String>();
		hash.put(1, "Arjun");
		hash.put(2, "Raju");
		hash.put(3, "shyam");
		hash.put(4, "sanjay");
		
		
		Hashtable<Integer, Double> product=new Hashtable<Integer,Double>();
		product.put(101, 1000.00);
		product.put(102, 2000.00);
		product.put(103, 3000.00);
		product.put(104, 4000.00);
		
		
		
		//Using keyname get keyvalue
		Double obj_price=product.get(103);
		System.out.println("Price of product is => "+obj_price);
		
		String person_name=hash.get(3);
		System.out.println("Person name is => "+person_name);
		
		
		//Get All keyset names
		Set<Integer> set=product.keySet();
		//foreach to iterate set of random objects
		for (Integer Each_prodcut_Key : set)
		{
			Double Value=product.get(Each_prodcut_Key);
			System.out.println(Value);
		}
		

	}

}
