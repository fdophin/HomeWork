package homework;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		System.out.print("Проверка числа на четность. \nВведи число: ");
		Scanner scn = new Scanner (System.in);
		int d = scn.nextInt();
			if (d%2==0){
				System.out.print("Четное!");
				
			} else System.out.print("Нечетное!");
	}

}
