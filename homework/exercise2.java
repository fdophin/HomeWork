package homework;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		System.out.print(" \n����� ����� I: ");
		Scanner scn = new Scanner (System.in);
		int d1 = scn.nextInt();
		System.out.print(" \n����� ����� II: ");
		int d2 = scn.nextInt();
		System.out.print(" \n����� ����� III: ");
		int d3 = scn.nextInt();
		
		/*��� ���:
		 * int max = Math.max(d1, d2);
		int max2 = Math.max(max, d3);
		System.out.print("�������: " + max2);*/
		
		if (d1>d2 && d1>d3)	System.out.print("�������: " + d1);
		 else if (d2>d3) System.out.print("�������: " + d2);
			 else System.out.print("�������: " + d3);
				    	
					
				
	}

}
