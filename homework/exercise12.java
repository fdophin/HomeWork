package homework;

import java.util.Scanner;

public class exercise12 {

	public static void main(String[] args) {
		int a1, a2, b1, b2, dot1, dot2;
		Scanner sc = new Scanner (System.in);
		System.out.print ("����� ���������� ��������������. \n����� ��� ������� ������ ����\n��� X: ");
		a1 = sc.nextInt();
		System.out.print ("��� Y: ");
		a2 = sc.nextInt();
		System.out.print ("\n����� ��� �������� ������� ����\n��� X: ");
		b1 = sc.nextInt();
		System.out.print ("��� Y: ");
		b2 = sc.nextInt();
		System.out.print ("\n����� ���������� �����, ��� �������� �������������� �� � ��������������. \n��� X: ");
		dot1 = sc.nextInt();
		System.out.print ("��� Y: ");
		dot2 = sc.nextInt();
		
		if(dot1>=a1 && dot1<=b1 && dot2>=a2 && dot2<=b2 ){
			System.out.print ("����� ����������� ��������������");
			} else {
				System.out.print("����� �� ����������� ��������������");
			 }
	}
	

}
