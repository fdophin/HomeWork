package dz2_0;

import java.util.Scanner;

public class z_09 {

	public static void main(String[] args) {
		System.out.print("Простое или составное?\nВведи цифру: ");
		Scanner scn = new Scanner (System.in);
		int in = scn.nextInt(); 
		String s = in%2 != 0? "Число простое.": "Число cоставное.";
		System.out.print (s);
	}

}
