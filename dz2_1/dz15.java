/*15. Вывести лестницу из отрезков определённой длины. Длина (например, 14) и 
количество ступенек (например, 4) указывается с клавиатуры.*/
package dz2_1;

import java.util.Scanner;

public class dz15 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Введи количество ступеней и длину ступени (через пробел):");
		int vis = sn.nextInt(), shir = sn.nextInt(), ione, itwo;
		String space = "";
		for (ione = 0; ione < vis; ione++) {
			space = space + "\t";
			System.out.print(space);
			for (itwo= 0; itwo < shir; itwo++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
