/*1. Ввести строку, а затем символ. Показать на экран индексы и количество совпадений.*/
package SringDz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class str01 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Ввести строку, а затем символ (через \"Enter\"): ");
		String str = sc.nextLine(), chr = sc.nextLine();
		
		//недоделано нет индексов
		
		System.out.println(str.indexOf(chr));
			
		int sim = str.length() - str.replaceAll(chr, "").length();
	
		System.out.printf("Количество символа \"%s\" = %s ", chr, sim);
	*/
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Ввести строку, а затем символ который нужно найти (через \"Enter\"): ");
		String str = sc.nextLine(), chr = sc.nextLine();
		int sum =0, arf[]=new int[str.length()];
		
        Pattern shab = Pattern.compile(chr);
        Matcher sovp = shab.matcher(str);
      int i =0;
      
     //вывод индексов найденных символов
        int index = str.indexOf(chr);
        while (index >= 0) {  // indexOf returns -1 if no match found
            System.out.println(index);
            index = str.indexOf(chr, index + 1);
           i++;
        }
        System.out.println(i);
        
        
        while (sovp.find()) {
            System.out.println(str.substring(sovp.start(), sovp.end()));
            sum++;
            //System.out.println(str.indexOf(chr));
        }
        
        System.out.println("Сумма: "+sum);
	}

}
