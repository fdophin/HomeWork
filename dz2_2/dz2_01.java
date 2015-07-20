/*1. Ввести массив из 5 чисел, а затем вывести его в обратном порядке.*/
package dz2_2;

import java.util.Scanner;

public class dz2_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int [5], i, j, i2 = array.length -1;
		for (i = 0; i < array.length; i++) {
			j = i + 1;
			System.out.printf("Введи число %s: ", j);
			array[i] = sc.nextInt();
		}
		for (; i2 >= 0; i2--){
			System.out.print(array[i2] + " ");
		}
		
	}

}
