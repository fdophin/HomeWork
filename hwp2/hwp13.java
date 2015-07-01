package hwp2;

import java.util.Random;
import java.util.Scanner;

public class hwp13 {

	public static void main(String[] args) {
	//	System.out.print();
		Scanner st = new Scanner(System.in);
		Random rand = new Random();
		int r = rand.nextInt(20);
		System.out.println ("Твой вопрос: ");
		String you =st.nextLine();
		switch (r) {
		 	case 1:
	            System.out.println("Да!"); 
	            break;
	         case 2:
		            System.out.println("Видится большой успех в этом направлении, продолжайте в том же духе..."); 
		        break;    
	         case 3:
	            System.out.println("Не по зубам тебе однако будет.");
	            break;
	         case 4:
	            System.out.println("Вот так удача.");
	         case 5:
	            System.out.println("Поменяй свой ход мысли, пока еще не поздно. Ok?!");
	            break;
	         case 6:
	            System.out.println("Все будет хорошо...");
	            break;
	         case 7:
		            System.out.println("Уж как знаешь!");
		        break;
	         case 8:
		            System.out.println("Хуже не будет.");
		        break;
	         case 9:
		            System.out.println("Спроси позже...");
		        break;
	         case 10:
		            System.out.println("О чем речь...");
		        break;
	         case 11:
		            System.out.println("Ляг, поспи и все пройдет.");
		        break;
	         case 12:
		            System.out.println("Это того не стоит.");
		        break;
	         case 13:
		            System.out.println("Думай об этом чаще. ");
		        break;
	         case 14:
		            System.out.println("Иш - размечтался.");
		        break;
	         case 15:
		            System.out.println("Не боись, все так и будет!");
		        break;
	         case 16:
		            System.out.println("Рискни, ведь ты шампанского еще не пил.");
		        break;
	         case 17:
		            System.out.println("Плохи твои дела!");
		        break;
	         case 18:
		            System.out.println("Хочешь это обсудить?");
		        break;
	         case 19:
		            System.out.println("Никого нет дома, перезвоните позже или оставте сообщение после сигнала.\nБииип!");
		        break;
	         case 20:
		            System.out.println("Нет!");
		        break;
		}
	}

}
