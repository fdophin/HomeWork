package homework;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		System.out.print("�������������, �������������, ����� ����! \n����� �����: ");
		Scanner scn = new Scanner (System.in);
		double dig = scn.nextDouble();
			if (dig > 0){
				System.out.print ("����� �������������.");
			}else {
				if (dig==0){
					System.out.print ("����� ����� 0.");
				}else {
					if(dig<0)
						System.out.print ("����� �������������.");
						}
			}
				

	}

}
