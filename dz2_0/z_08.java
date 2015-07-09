package dz2_0;

import java.util.Scanner;

public class z_08 {

	public static void main(String[] args) {
		System.out.print("Деление без остатка.\nВведи цифру: ");
		Scanner scn = new Scanner (System.in);
		for (int i = 1, in = scn.nextInt(); i <= in; i++){
			if ( in%i != 0) continue; 
            System.out.print(i + " " );
        }

	}

}
