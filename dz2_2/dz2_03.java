/*3. Создать массив из 10 случайных чисел в диапазоне от -20 до 20. Определить 
количество, сумму  и среднее арифметическое положительных элементов массива.*/

package dz2_2;

public class dz2_03 {

	public static void main(String[] args) {
		int array[] = new int [10], i = 0, pos = 0, sum = 0;
		for (; i < array.length; i++) {
			array [i] =(int)(Math.random()*41 + (-20));
			if (array [i]>0) {
				pos++;
		  sum += array [i];
			}
			 System.out.print( array [i]+ " ");
			 	
		}
		 System.out.printf("\n\nВ массиве положительных чисел: %s \nИх сумма: %s \nСреднее арифметическое: %s  ", pos, sum, ((double)(sum)/(pos)));
		
	}

}
