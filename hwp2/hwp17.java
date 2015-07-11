package hwp2;

import java.util.Random;
import java.util.Scanner;

public class hwp17 {

	public static void main(String[] args) {
		
		for(int credit = 5000; credit > 0;){
		credit = credit - 10; // За одну комбинацию прога снимает 100 едениц
		Random rand = new Random();
		int r1 = rand.nextInt(7);
		int r2 = rand.nextInt(7);
		int r3 = rand.nextInt(7);
		if (r1 == 7  && r2 == 7 && r3 == 7){
			credit+=25000;
			System.out.println("У тебя Джекпот 25000 грн. \nТвой кредит: " + credit);
			break;
		}else if (r1+r2+r3 == 0 || r1== 1 && r2 == 1 && r3 == 1 || r1== 2 && r2 == 2 && r3 == 2 || r1== 3 && r2 == 3 && r3 == 3 || r1== 4 && r2 == 4 && r3 == 4 || r1 == 5 && r2 == 5 || r1 == 7 && r3!=7){
			credit+=500;
			System.out.println("Выгрышная комбинация: " + r1 + "" + "" + r2 + "" + r3 + "\nКредит + 500 грн. " + credit);
			Scanner s = new Scanner(System.in);
			System.out.println("Продолжить? Ввод.");
			String x = s.nextLine();
			
		} else if (r1==6 && r2==6 && r3 == 6 ){
			credit=0;
			System.out.println("Ты проиграл и все потерял(666) \nТвой кредит: " + credit);
			break;
		}
		System.out.println(r1 + "" + r2 + ""+ r3);
		if (credit == 0) System.out.println("Игра окончена!");
		}
	}

}
