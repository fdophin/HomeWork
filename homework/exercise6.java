package homework;

import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {
		double N, M, dot;
		Scanner sc = new Scanner (System.in);
		System.out.print ("����� ��������: \n��������� ����� N: ");
		N = sc.nextDouble();
		System.out.print ("�������� M: ");
		M = sc.nextDouble();
		System.out.print ("\n����� ����� ������� �����: ");
		dot = sc.nextDouble();
		
		
		if(dot>=N && dot<=M){
			System.out.print ("����� ����������� ���������");
			} else {
				System.out.print("����� �� ����������� ���������");
			 }
	}

}
