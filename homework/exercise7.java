package homework;

import java.util.Scanner;

public class exercise7 {

	public static void main(String[] args) {
		System.out.print("�������� 2-� ����� �� ���������. \n����� ����� �:  ");
		Scanner scn = new Scanner (System.in);
		int d1 = scn.nextInt();
		System.out.print("\n����� ����� b:  ");
		int d2 = scn.nextInt();
		if (d1%d2==0){
				System.out.print(d1 + "�" + d2 + " " + "�������!");
				
			} else System.out.print(d1 + "�" + d2 + " " + "�� �������!");

	}

}
