package homework;

import java.util.Scanner;

public class exercise10 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		System.out.print("Сколько символов в строке? \nВведи слово или число: ");
		String st = scn.nextLine();
		int n = st.length();
		System.out.print("В строке: " + n + " символов!");

	}

}
