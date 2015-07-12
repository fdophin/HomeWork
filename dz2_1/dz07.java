/*7. Определить, является ли введённое число любой разрядности палиндромом 
(например, 1234321 – палиндром, 12345 – не палиндром).*/
package dz2_1;

import java.util.Scanner;

public class dz07 {

	public static void main(String[] args) {
		/* пример
		Scanner sn = new Scanner(System.in);
		System.out.print("Введите целое число: ");

		long a = sn.nextLong();

		byte count, i;

		boolean palindrom = true;

		for ( count=1; (a/(int)Math.pow(10,count))!=0; count++ );

		for ( i=0; i<count; i++ )

		palindrom &= ( (a/(int)Math.pow(10,i)) %10 == a/(int)Math.pow(10,count-1-i) %10 )?true:false; 

		System.out.printf("Введенное число %s полиндромом", (palindrom)?"является":"не является");*/

			System.out.print("Введи число: ");
	      	Scanner scan = new Scanner(System.in);
			String n = scan.nextLine();
			String Re = new StringBuffer(n).reverse().toString();
			System.out.println((n.equals (Re))? "Полиндром": "Неполиндром" );
		     
	
		
		
	
	}

}
