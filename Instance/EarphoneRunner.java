package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Earphone;

public class EarphoneRunner {

	public static void main(String[] args) {

		String[] color= {"White,Black,Blue,Red"};
		String[] country= {"India,China,America"};
		int[] price= {999,759,799,699};
		double[] weight= {98,112,125,110};
		Earphone ear=new Earphone("Boat", true, true, 2022, 1, color, country, price, weight);
		ear.display();
		System.out.println(System.lineSeparator());

		Earphone ear1=new Earphone("Oneplus", true, true, 2020, 1, color, country, price, weight);
		ear1.display();
		System.out.println(System.lineSeparator());

		Earphone ear2=new Earphone("JBL", true, true, 2021, 1, color, country, price, weight);
		ear2.display();
		System.out.println(System.lineSeparator());

		Earphone ear3=new Earphone("Noise", true, true, 2018, 1, color, country, price, weight);
		ear3.display();

		
	}

}
