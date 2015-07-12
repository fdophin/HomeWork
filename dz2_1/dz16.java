/*16. Показать на экране лесенку. Количество ступенек (например, 5) указывает
пользователь.*/
package dz2_1;

import java.util.Scanner;

public class dz16 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Введи количество ступенек :");
		int vis = 2, shir = 3, x, y, i = sn.nextInt();
		String space = "";
		for (; i > 0; i--) {
			space += " ";
			// Упрощенный: System.out.println (space +"***"+ "\n"+ space +"  *");
			for (y = 0; y < vis; y++) {
				System.out.print(space);
				for (x = 0; x < shir; x++) {
					if (y == 0 || y == vis - 1 && x == shir - 1) {
						System.out.print("*");

					} else {
						System.out.print(" ");
					}

				}
				System.out.println();
			}
		}

	}

}
