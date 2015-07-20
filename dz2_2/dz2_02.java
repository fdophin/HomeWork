/*2. Создать массив из 20 случайных чисел. Вывести все элементы массива с чётными
индексами.*/

package dz2_2;

public class dz2_02 {

	public static void main(String[] args) {
		int array[] = new int [20], i = 0;
		for (; i < array.length; i++) {
			array [i] =(int)(Math.random()*100+0);
			//Вывод значений с четными индексами елемента массива
				 System.out.print((i%2 == 0)? array [i]+" ":"");
			
		}

	}

}
