package hwp2;

import java.util.Scanner;

public class hwp1 {

	public static void main(String[] args) {
		System.out.println ("Введи координаты прямой для точек (X1, Y1) и (X2, Y2).");
		Scanner st = new Scanner(System.in);
		double xA, yA, xB, yB;
		
		do {
		System.out.print ("\nX1: ");
		xA = st.nextDouble ();
		System.out.print ("Y1: ");
		yA = st.nextDouble ();
		System.out.print ("X2: ");
		xB = st.nextDouble ();
		System.out.print ("Y2: ");
		yB = st.nextDouble ();
		} while (xA + yB == yA + yB); //Если, точки A и B совпадают программа повторно запросит ввод. 
		
		if (xA == xB || yA == yB){
			if (xA == xB) 
				System.out.print ("Прямая параллельна оси X.");
				else System.out.print ("Прямая параллельна оси Y.");
		} else	System.out.print ("Прямая не параллельна ни одной из осей.");
		
	}

}
