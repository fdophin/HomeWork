/*2. Вывести на экран таблицу умножения (таблицу Пифагора).*/
package dz2_1;

public class dz02 {

	public static void main(String[] args) {
		for (int mnoj = 1; mnoj <= 9; mnoj++){
			for (int na = 1; na <= 9; na++){
				System.out.print(na * mnoj + "\t");
			}
			
			System.out.println();			
			
		}
	}
}
