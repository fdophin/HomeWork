package hwp2;

import java.util.Scanner;

public class hwp1 {

	public static void main(String[] args) {
		System.out.println ("����� ���������� ������ ��� ����� (X1, Y1) � (X2, Y2).");
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
		} while (xA + yB == yA + yB); //����, ����� A � B ��������� ��������� �������� �������� ����. 
		
		if (xA == xB || yA == yB){
			if (xA == xB) 
				System.out.print ("������ ����������� ��� X.");
				else System.out.print ("������ ����������� ��� Y.");
		} else	System.out.print ("������ �� ����������� �� ����� �� ����.");
		
	}

}
