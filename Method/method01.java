/*1. Написать статический метод, который возвращает куб вещественного числа.*/
package Method;

import java.util.Scanner;

public class method01 {

	public static void main(String[] args) {
		
		pow();
		
	}

	public static void pow (){
		System.out.print("Возведение в куб. \nВведи число: ");
		Scanner sc = new Scanner(System.in);
		float cub = sc.nextFloat();
		System.out.print(Math.pow(cub, 3));
		
		
	}
	
}
