package homework;

import java.util.Scanner;

public class exercise7 {

	public static void main(String[] args) {
		System.out.print("Проверка 2-х чисел на кратность. \nВведи число а:  ");
		Scanner scn = new Scanner (System.in);
		int d1 = scn.nextInt();
		System.out.print("\nВведи число b:  ");
		int d2 = scn.nextInt();
		if (d1%d2==0){
				System.out.print(d1 + "и" + d2 + " " + "Кратные!");
				
			} else System.out.print(d1 + "и" + d2 + " " + "Не кратные!");

	}

}
