package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.SoftDrinks;

public class SoftDrinksRunner {

	public static void main(String[] args) {

		

		String[] color= {"Green,White,Red,Orange"};
		String[] name= {"Sprite,Mirinda,MountainDew"};
		char[] size= {'L','M','S'};
		double[] price= {40,88,150,225};
		SoftDrinks drink=new SoftDrinks(250, 2020, 2023, false, true, color, name, size, price);
		drink.display();

		System.out.println(System.lineSeparator());

		SoftDrinks drink1=new SoftDrinks(125, 2021, 2023, true, false, color, name, size, price);
		drink1.display();
		
		System.out.println(System.lineSeparator());

		SoftDrinks drink2=new SoftDrinks(150, 2018, 2024, false, true, color, name, size, price);
		drink2.display();
	
		
	}

}
