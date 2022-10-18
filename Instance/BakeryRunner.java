package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Bakery;

public class BakeryRunner {

	public static void main(String[] args) {

		String[] items= {"Chips,Cakes,Chocolates,Biscuits"};
		String[] sweets= {"Mysorepak,Jaamun,Laddu"};
		double[] price= {120,150,185,200};
		String[] customers= {"Employees,Students,Kids"};
		Bakery bun=new Bakery("Iyengars Bakery", 78497, "Venkat", "Bangalore", false, items, sweets, price, customers);
		bun.display();
		
		System.out.println(System.lineSeparator());

		Bakery bun1=new Bakery("Udupi Bakery", 87459, "Akash", "Hubli", false, items, sweets, price, customers);
		bun1.display();
		System.out.println(System.lineSeparator());

		Bakery bun2=new Bakery("Venkateshwar Bakery", 94568, "Prakash", "Tumkur", false, items, sweets, price, customers);
		bun2.display();
		System.out.println(System.lineSeparator());


		Bakery bun3=new Bakery("Maruti Bakery", 67894, "Veeresh", "Bagalkot", false, items, sweets, price, customers);
		bun3.display();

		
	}

}
