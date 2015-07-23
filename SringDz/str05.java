/*5. Определить, является ли строка палиндромом. Примеры палиндромов:
 * Аргентина манит негра.
Лёша на полке клопа нашёл.
Нажал кабан на баклажан.
Я так нежен, Катя.
Он дебил и жили бедно.
Что к супу? Скотч?
О, накакано!
Юра, хватит! - А в харю?*/

package SringDz;

import java.util.Scanner;

public class str05 {

	public static void main(String[] args) {
				
		System.out.print("Введи предложение: ");
      	Scanner scan = new Scanner(System.in);
		
      	String ar [] = {".", " ", ";", ",", "?", "!", "-", "@", "'", "*", "/", "\\"}, n = scan.nextLine();
      	
      	for(int i =0; i < ar.length; i++){    //fuck while (n.contains())
      	String res = ar[i];
      	n = n.replace(res,"");
      	
      	}
   	         	
      	String Re = new StringBuffer(n).reverse().toString();
		System.out.printf("Предложение %s",(n.compareToIgnoreCase(Re) == 0)? "полиндромно!": "не полиндромно!" );
		System.out.println("\n"+Re);
	}

}
