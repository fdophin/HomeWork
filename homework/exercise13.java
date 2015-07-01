package homework;

import java.util.Scanner;

public class exercise13 {

	public static void main(String[] args) {
		System.out.print(" \nВведи число I: ");
		Scanner scn = new Scanner (System.in);
		int d1 = scn.nextInt();
		System.out.print(" \nВведи число II: ");
		int d2 = scn.nextInt();
		System.out.print(" \nВведи число III: ");
		int d3 = scn.nextInt();
		System.out.print(" \nВведи число IV: ");
		int d4 = scn.nextInt();
		int res = d1>d2 && d1>d3 && d1>d4?d1:d2>d3 && d2>d4?d2:d3>d4?d3:d4;		
		System.out.print("Число: " + res + " большее.");
	}

}
