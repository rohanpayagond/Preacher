package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {


		double[] price= {42000,45000,52000,59000};
		String[] processor= {"Core i3,Core i5,Core i9"};
		String[] modelNo= {"7848AB,4769SS,7958EW,7958Dn"};
		String[] items= {"Keyboard,Mouse,Antivirus"};
		Laptop buy=new Laptop("Abhijeet", "Dell", 975, "Good",true, price, processor, modelNo, items);
		buy.display();
		System.out.println(System.lineSeparator());
		
		Laptop buy1=new Laptop("Sujan", "Lenovo", 1025, "Good",true, price, processor, modelNo, items);
		buy1.display();
		System.out.println(System.lineSeparator());
		
		Laptop buy2=new Laptop("Vinod", "Acer", 855, "Worst",true, price, processor, modelNo, items);
		buy2.display();
		System.out.println(System.lineSeparator());
		
	
	}

}
