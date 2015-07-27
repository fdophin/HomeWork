/*5. Написать статический метод для округления заданного числа до указанного
количества знаков после запятой.*/
package Method;

import java.util.Scanner;

public class method05 {

	public static void main(String[] args) {
		System.out.println ("Введи число, например: 12,8912883 и количество разрядов после запятой - 2 (через пробел): ");
		Scanner sc = new Scanner(System.in);
		rank(sc.nextDouble(), sc.nextInt());

	}

	public static void rank (double digit, int sign){
		int r = (int) Math.pow(10,sign);
		System.out.print( (double)Math.round(digit*r)/r);
	}
	
}
