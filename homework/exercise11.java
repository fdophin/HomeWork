package homework;

import java.util.Scanner;

public class exercise11 {

	public static void main(String[] args) {
		/*String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("�������� �� ���������. \n����� 5-�� ������� �����: ");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	      System.out.println (reverse);
	      if (original.equals(reverse))
	         System.out.println("������ �����������.");
	      else
	         System.out.println("������ �� �����������.");*/
		System.out.println("�������� �� ���������. \n����� 5-�� ������� �����: ");
	      Scanner srin = new Scanner(System.in);
			String num = srin.nextLine();
			String rev = new StringBuffer(num).reverse().toString();
			 System.out.println(rev);
			if (num.equals (rev)){
		         System.out.println("������ �����������.");
			} else {
		         System.out.println("������ �� �����������.");
			}
	}

}
