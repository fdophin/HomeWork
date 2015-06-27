package homework;

import java.util.Scanner;

public class exercise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print ("Показать модуль числа. \nВведи число: ");
		double mod = Math.abs(sc.nextDouble());
		System.out.print(mod);

	}

}
