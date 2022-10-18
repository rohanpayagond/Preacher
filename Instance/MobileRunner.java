package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Mobile;

public class MobileRunner {

	public static void main(String[] args) {

		String[] name= {"Galaxy,Galaxy Note,Star Pro"};
		double[] price= {58000,67000,25000};
		int[] storage= {64,128,256};
		String[] color= {"White,Black,Blue"};
		Mobile set=new Mobile("Samsung", "78EA47", 2020, 316, true, name, price, storage, color);
		set.display();
		
		System.out.println(System.lineSeparator());
		
		Mobile set1=new Mobile("Nokia", "47NK97", 2021, 224, false, name, price, storage, color);
		set1.display();
		System.out.println(System.lineSeparator());

		Mobile set2=new Mobile("Redmi", "97MI487", 2018, 297, true, name, price, storage, color);
		set2.display();
		System.out.println(System.lineSeparator());

		Mobile set3=new Mobile("Oneplus", "89OP458", 2019, 185, false, name, price, storage, color);
		set3.display();
		
				
	}

}
