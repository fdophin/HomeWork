/*1. Вывести на экран горизонтальную линию из звёздочек. Число звездочек 
указывает пользователь.*/
package dz2_0;

import java.util.Scanner;

public class z_01 {

	public static void main(String[] args) {
			System.out.print("Сколько звезд нужно вывести? \nВведи число: ");
			Scanner sn = new Scanner(System.in);
			char star = '*';
	        for (int i = sn.nextInt(); i > 0; System.out.print(star), i--); 
  
	}
}                        



