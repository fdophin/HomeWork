package homework;

import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {
		double N, M, dot;
		Scanner sc = new Scanner (System.in);
		System.out.print ("Введи диапазон: \nначальная точка N: ");
		N = sc.nextDouble();
		System.out.print ("конечная M: ");
		M = sc.nextDouble();
		System.out.print ("\nВведи число искомой точки: ");
		dot = sc.nextDouble();
		
		
		if(dot>=N && dot<=M){
			System.out.print ("Точка пренадлежит диапазону");
			} else {
				System.out.print("Точка не пренадлежит диапазону");
			 }
	}

}
