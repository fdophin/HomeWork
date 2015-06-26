package homework;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		System.out.print(" \nВведи число 1: ");
		Scanner scn = new Scanner (System.in);
		int d1 = scn.nextInt();
		System.out.print(" \nВведи число 2: ");
		int d2 = scn.nextInt();
		System.out.print(" \nВведи число 3: ");
		int d3 = scn.nextInt();
		
			if (d1>d3 && d1>d2)	System.out.print("Большее: " + d1);
			 else if (d2>d1 && d2>d3) System.out.print("Большее: " + d2);
				 else if (d3>d1 && d3>d2) System.out.print("Большее: " + d3);
				    	
					
				
	}

}
