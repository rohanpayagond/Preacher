package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Shoes;

public class ShoesRunner {

	public static void main(String[] args) {

		double[] price= {2300,2115,1984,1756};
		int[] no= {784,997,698,784};
		int[] size= {7,9,11,8,10};
		String[] country= {"India,London,Japan"};
		String[] color= {"Red,White,Grey"};
		Shoes leg=new Shoes(125, 2022, "Nike", "Amogh", false, price, no, size, country, color);
		leg.display();

		System.out.println(System.lineSeparator());

		Shoes leg1=new Shoes(115, 2021, "Sparx", "Suman", true, price, no, size, country, color);
		leg1.display();
		
		System.out.println(System.lineSeparator());

		Shoes leg2=new Shoes(100, 2020, "Adidas", "Ajay", true, price, no, size, country, color);
		leg2.display();
		
		
	}

}
