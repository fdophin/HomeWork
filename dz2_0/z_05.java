/*5. Написать программу, вычисляющую факториал введённого числа.*/
package dz2_0;

import java.util.Scanner;

public class z_05 {

	public static void main(String[] args) {
		System.out.print ("Фактоиал числа, веди цыфру: ");
		Scanner scn = new Scanner (System.in);
		
		
        for (int count = 1, start = 1, nfac = scn.nextInt(); count <= nfac; ++count){
        	start *= count;
        
			if (count != nfac)continue; System.out.print (start); 
        }
	}

}

