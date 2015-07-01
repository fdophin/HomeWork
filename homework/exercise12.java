package homework;

import java.util.Scanner;

public class exercise12 {

	public static void main(String[] args) {
		int a1, a2, b1, b2, dot1, dot2;
		Scanner sc = new Scanner (System.in);
		System.out.print ("Введи координаты прямоугольника. \nТочка для нижнего левого угла\nось X: ");
		a1 = sc.nextInt();
		System.out.print ("ось Y: ");
		a2 = sc.nextInt();
		System.out.print ("\nТочка для верхнего правого угла\nось X: ");
		b1 = sc.nextInt();
		System.out.print ("ось Y: ");
		b2 = sc.nextInt();
		System.out.print ("\nВведи координаты точки, для проверки пренадлежности ее к прямоугольнику. \nось X: ");
		dot1 = sc.nextInt();
		System.out.print ("ось Y: ");
		dot2 = sc.nextInt();
		
		if(dot1>=a1 && dot1<=b1 && dot2>=a2 && dot2<=b2 ){
			System.out.print ("Точка пренадлежит прямоугольнику");
			} else {
				System.out.print("Точка не пренадлежит прямоугольнику");
			 }
	}
	

}
