package dz2_0;

import java.util.Scanner;

public class z_04 {

	public static void main(String[] args) {
		System.out.println ("Введи диапазон от N до M (через пробел): ");
		Scanner scn = new Scanner (System.in);
		
		 for (double C = 0, F = 32; C <= 100; System.out.println(C + " - " +F), C++, F+=1.8); 

	}

}
