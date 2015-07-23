/*7. Заменить по строке одно заданное слово на другое.*/
package SringDz;

import java.util.Scanner;

public class str07 {

	public static void main(String[] args) {
		
		boolean unknown = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введи любое предложение:");
		String stBuff = new StringBuffer(sc.nextLine()).toString();
		System.out.println("А теперь замени любое слово!\nВведи слова через \"Enter\", 1) заменяемое 2) заменить на:\n");
		while(unknown){
		String st = sc.nextLine(), strp = sc.nextLine();
			if(stBuff.contains(st)){
			unknown = false;
			stBuff=stBuff.replace(st, strp);
			} else System.out.println("В слове ошибка, или такого слова в тексте нет.\nПопробуй еще раз...");
		}
			System.out.print("Вот что получилось:\n" + stBuff);
		
		
		
	}

}
