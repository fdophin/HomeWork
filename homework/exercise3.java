package homework;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		System.out.print("Положительное, отрицательное, равно нулю! \nВведи число: ");
		Scanner scn = new Scanner (System.in);
		double dig = scn.nextDouble();
			if (dig > 0){
				System.out.print ("Число положительное.");
			}else {
				if (dig==0){
					System.out.print ("Число равно 0.");
				}else {
					if(dig<0)
						System.out.print ("Число отрицательное.");
						}
			}
				

	}

}
