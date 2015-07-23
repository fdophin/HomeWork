/*6. Посчитать, сколько раз заданное слово содержится в строке.*/
package SringDz;

import java.util.Scanner;

public class str06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W_Blake = "Дан текст:\n\nEvery night and every morn \nSome to misery are born. \nEvery morn and every night \nSome are born to sweet delight. \nSome are born to sweet delight. \nSome are born to endless night.";
		System.out.println(W_Blake+"\n\nВведи любое слово из текста: ");			
		String word = sc.nextLine();
		int i = 0, pos = W_Blake.indexOf(word); //Тут указана первая позиция слова
		     while (pos  >= 0) {  //перебор до тех пор пока pos не станет -1
	            
	        	pos  = W_Blake.indexOf(word, pos + 1  ); 
	           i++;
	           System.out.println(pos);
	        }
	        System.out.println("Количество слов: "+i);	
	}
}


