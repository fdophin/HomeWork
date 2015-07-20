/*5. Написать программу, которая предлагает пользователю ввести число, и затем 
подсчитывает, сколько раз это число встречается в массиве на 100 случайных 
элементов.*/
package dz2_2;

import java.util.Scanner;

public class dz2_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Сколько раз встречается число в массиве из 100 случайнных цыфр.\nВведи число: ");
		int arra [] = new int [100], indig = sc.nextInt(), count = 0;
		for (int i =0; i < arra.length; i++){
			arra [i] = (int)(Math.random()*100+(0));
			
			if (indig == arra [i]) count++; 
		}
System.out.printf("Число встречается %s раз(а).", count);
	}

}
