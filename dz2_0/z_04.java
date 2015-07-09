/*4. Программа печатает таблицу соответствия температур по Цельсию и Фаренгейту 
в указанном диапазоне.*/

package dz2_0;

import java.util.Scanner;

public class z_04 {

	public static void main(String[] args) {
		System.out.print ("Введи диапазон температуры от, до (через пробел в ºC): ");
		Scanner scn = new Scanner (System.in);
		double inC = scn.nextInt(), count = scn.nextInt();
		 for (double C = -273, F = -459.4; C <= count; C++, F+=1.8){
			 if(C <inC )continue;
				 System.out.println(C + "ºC" + " - " + Math.round(F) + "ºF" );
		 }

	}

}
