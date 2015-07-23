/*2. Написать программу, определяющую количество гласных букв в слове. Слово может
 * быть как на английском, так и на русском языке.*/
package SringDz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class str02 {

	public static void main(String[] args) {
		System.out.print("Введи предложение: ");
      	Scanner scan = new Scanner(System.in);
		int sum = 0;
      	String ar [] = {"a", "e", "i", "o", "u", "e", "а", "о", "у", "э", "ы", "я", "ё", "ю", "е", "и"}, n = scan.nextLine();
      	
      	for(int i =0; i < ar.length; i++){ 
      		 Pattern shab = Pattern.compile(ar[i]);
      		 Matcher sovp = shab.matcher(n);
       		if(sovp.find()){
       			sum++;			
         	}
           	 
      	}
      	System.out.println("Сумма глассных: "+sum);

	}

}
