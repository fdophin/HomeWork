package hwp2;

import java.util.Random;
import java.util.Scanner;

public class hwp13 {

	public static void main(String[] args) {
	//	System.out.print();
		Scanner st = new Scanner(System.in);
		Random rand = new Random();
		int r = rand.nextInt(20);
		System.out.println ("���� ������: ");
		String you =st.nextLine();
		switch (r) {
		 	case 1:
	            System.out.println("��!"); 
	            break;
	         case 2:
		            System.out.println("������� ������� ����� � ���� �����������, ����������� � ��� �� ����..."); 
		        break;    
	         case 3:
	            System.out.println("�� �� ����� ���� ������ �����.");
	            break;
	         case 4:
	            System.out.println("��� ��� �����.");
	         case 5:
	            System.out.println("������� ���� ��� �����, ���� ��� �� ������. Ok?!");
	            break;
	         case 6:
	            System.out.println("��� ����� ������...");
	            break;
	         case 7:
		            System.out.println("�� ��� ������!");
		        break;
	         case 8:
		            System.out.println("���� �� �����.");
		        break;
	         case 9:
		            System.out.println("������ �����...");
		        break;
	         case 10:
		            System.out.println("� ��� ����...");
		        break;
	         case 11:
		            System.out.println("���, ����� � ��� �������.");
		        break;
	         case 12:
		            System.out.println("��� ���� �� �����.");
		        break;
	         case 13:
		            System.out.println("����� �� ���� ����. ");
		        break;
	         case 14:
		            System.out.println("�� - �����������.");
		        break;
	         case 15:
		            System.out.println("�� �����, ��� ��� � �����!");
		        break;
	         case 16:
		            System.out.println("������, ���� �� ����������� ��� �� ���.");
		        break;
	         case 17:
		            System.out.println("����� ���� ����!");
		        break;
	         case 18:
		            System.out.println("������ ��� ��������?");
		        break;
	         case 19:
		            System.out.println("������ ��� ����, ����������� ����� ��� ������� ��������� ����� �������.\n�����!");
		        break;
	         case 20:
		            System.out.println("���!");
		        break;
		}
	}

}
