/*2.Проверить, имеет ли введённое число вещественную часть. 
 * Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5 и 10.0 – нет.*/
package hwp2;

import java.util.Scanner;

public class hpw02 {

	public static void main(String[] args) {
		System.out.print ("Введи число, целое или дробное: ");
		Scanner st = new Scanner (System.in);
		double num =  st.nextDouble();
		int inum = (int)num; //целое 
		double dnum = num - inum; //дробное 
		if (dnum == 0) {
			System.out.println ("Число целое.");
		} else System.out.println ("Число дробное.");
	//-----------------2 вариант--------------------------
		if(num-Math.floor(num)== 0){
			System.out.println ("Число целое.");
			}else{
				System.out.println ("Число дробное.");
			}
	}

}