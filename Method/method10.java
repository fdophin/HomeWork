/*10. Написать рекурсивный статический метод нахождения факториала числа.*/

package Method;

import java.util.Scanner;

public class method10 {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print ("Введи число: ");
		int in = Factorial( in = sc.nextInt());
		System.out.print (in);
		
	}

	 public static int Factorial(int num)
	    {
	        if (num == 0) return 1;
	        return num * Factorial(num-1);
	    }
}
