package homework;

import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		
		System.out.print(" \n¬веди число a: ");
		Scanner scn = new Scanner (System.in);
		double a = scn.nextDouble();
		System.out.print(" \n¬веди число b: ");
		double b = scn.nextDouble();
		System.out.print("1) a + b\n2) a Ц b\n3) a * b\n4) a / b\n5) a % b\n¬ыбери действи€ от 1-5: ");
		int oper = scn.nextInt();
		if (oper==1) System.out.print(a+b);
		if (oper==2) System.out.print(a-b);
		if (oper==3) System.out.print(a*b);
			if (oper==4){
				while (b==0){
					System.out.print("ƒеление на 0 запрещено, введи цифру больше нул€: ");
					b = scn.nextDouble();
					if (b>0) System.out.print(a/b);
							}
						}
		if (oper==5) System.out.print(a%b);
	}

}
