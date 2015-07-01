package homework;

import java.util.Scanner;

public class exercise8 {

	public static void main(String[] args) {
		System.out.print("Проверка чисела на кратность: 3, 5, 7. \nВведи число:  ");
		Scanner scn = new Scanner (System.in);
		int d1 = scn.nextInt();
			if (d1%3==0 && d1%5==0 && d1%7==0 ){
				System.out.print("Число: " + d1 + " " + "кратно 3, 5, 7!");
			     } else System.out.print("Число: " + d1 + " " + "не кратно 3, 5, 7!");

	}

}
