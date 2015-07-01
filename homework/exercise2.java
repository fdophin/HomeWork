package homework;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		System.out.print(" \nВведи число I: ");
		Scanner scn = new Scanner (System.in);
		int d1 = scn.nextInt();
		System.out.print(" \nВведи число II: ");
		int d2 = scn.nextInt();
		System.out.print(" \nВведи число III: ");
		int d3 = scn.nextInt();
		
		/*Или так:
		 * int max = Math.max(d1, d2);
		int max2 = Math.max(max, d3);
		System.out.print("Большее: " + max2);*/
		
		if (d1>d2 && d1>d3)	System.out.print("Большее: " + d1);
		 else if (d2>d3) System.out.print("Большее: " + d2);
			 else System.out.print("Большее: " + d3);
				    	
					
				
	}

}
