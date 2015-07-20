/*18. Создать массив из 10 целых случайных чисел в диапазоне от 0 до 100. Найти элемент, 
максимально близкий к среднему арифметическому значений массива.*/
package dz2_2;

public class dz2_18 {

	public static void main(String[] args) {
		int array[] = new int [10], sum = 0, el_res = 0;
		double aritm = 0, prom = 0, min = 0 ;
		for (int i = 0; i < array.length; i++) {
			array [i] =(int)(Math.random()*101+0);
			sum += array[i];
			aritm = ((double)sum) / ((double)array.length);
		min = aritm;
				prom = Math.abs(array[i]-aritm);
				if (prom<min){
				min=prom;
				el_res = array[i];
				}
			// Переделать Ошибка!
			System.out.print(array [i]+" ");

		}
		System.out.printf("\nСреднее арифметическое: %s %s %s", aritm, el_res, prom);
		
		
}
}