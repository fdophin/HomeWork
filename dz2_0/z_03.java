/*3. Вычислить сумму чисел в диапазоне от M до N.*/
package dz2_0;

import java.util.Scanner;

public class z_03 {

	public static void main(String[] args) {
		System.out.print ("Введи диапазон от N до M (через пробел): ");
		Scanner scn = new Scanner (System.in);
		
		for (int N = scn.nextInt(), M = scn.nextInt(), i = N + 1; i <= M; i++) {
			N+=i;
			if (i != M)continue; System.out.print (N); 
						
		}

	}

}
