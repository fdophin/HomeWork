package hwp2;

import java.util.Scanner;

public class hwp03 {

	public static void main(String[] args) {
		
	
		Scanner st = new Scanner(System.in);
		System.out.println ("Введи номер дня недели: ");
		int n = st.nextInt();
		switch (n) {
		 	case 1:
	            System.out.println("Понедельник"); 
	            break;
	         case 2:
		            System.out.println("Вторник"); 
		        break; 
	         case 3:
		            System.out.println("Среда"); 
		        break;
	         case 4:
		            System.out.println("Четверг"); 
		        break;
	         case 5:
		            System.out.println("Пятница"); 
		        break;
	         case 6:
		            System.out.println("Суббота"); 
		        break;
	         case 7:
		            System.out.println("Воскресенье"); 
		        break;
		}
	}
}
	
