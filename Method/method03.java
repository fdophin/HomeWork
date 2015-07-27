package Method;

/*3. Написать статический метод, который получает в качестве параметров два
целых числа, и возвращает сумму чисел из диапазона между ними.*/
import java.util.Scanner;

public class method03 {

	public static void main(String[] args) {
	
		sum();
	}

	public static void sum (){
		Scanner sc = new Scanner(System.in);
		System.out.print("Введи диапазон, от (пробел) до: ");
		int d1 = sc.nextInt(), d2 = sc.nextInt(), sumd = 0; 
		
		for(int i = d1+1; i<d2; i++){
				sumd +=i;
		}
		System.out.printf("Сумма чисел между %s и %s (исключительно): %s", d1, d2, sumd);
		
	}
}
