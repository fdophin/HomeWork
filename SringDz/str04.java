/*4. Подсчитать среднюю длину слова во введённом предложении.*/
package SringDz;

import java.util.Scanner;

public class str04 {

	public static void main(String[] args) {
		
		//пример, адаптировать
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введи предложение: ");
		String ar [] = {".", ";", " ,", "  ", ",", "?", "!", "-", "@", "'", "*", "/", "\\"},  str =  sc.nextLine();
	    double sum = 0;
	    
      	
	 	    
	    for(int i =0; i < ar.length; i++){    
	      	String res = ar[i];
	      	str = str.replace(res,"");
	     }
	    System.out.print(str);
      	String arStr [] = str.split(" ");
	    for(int i =0;i<arStr.length;i++) {              
	      
	    	sum+=arStr[i].length();	      	
	    }
	    System.out.println (arStr [1]);
	    
	     System.out.printf("Количесто слов в предложении: %s.\nСредняя длина слов %.2f симв.", arStr.length, (sum/arStr.length));

	}

}
