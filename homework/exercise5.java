package homework;

import java.util.Scanner;
//import java.lang.Character;
public class exercise5 {

	public static void main(String[] args) {
	System.out.print ("Введи сивол, число или знак : ");
	Scanner sc = new Scanner(System.in);
	char cha = sc.next().charAt(0);
	
	  if ( Character.isDigit(cha) ) System.out.print ("цифра");
	  else if ( Character.isLetter(cha) ) System.out.print ("буква");
	  else System.out.print ("спецсимвол");
	}

}
