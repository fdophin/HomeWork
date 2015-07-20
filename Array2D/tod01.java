/*1. Дан двумерный массив размерностью 5х5, заполненный случайными числами из 
диапазона от 0 до 20. Определить сумму элементов массива, среднее 
арифметическое, минимальный и максимальный элемент.*/

package Array2D;

public class tod01 {

	public static void main(String[] args) {
		/*1-e и 2-e задания в одном*/
		
		int rows = 5, strg = 5, diag = 0, diag2 = 0;
		int arfi[][] = new int[rows][strg], sum=0, dmx = arfi[0][0];
		for (int i = 0; i < arfi.length; i++) {
			for (int i2 = 0; i2 < arfi.length; i2++) {
				
				arfi[i][i2] = (int) (Math.random() * 21 + 0);
				System.out.print(arfi[i][i2] + "\t");
				
				sum+=arfi[i][i2];
				if (arfi[i][i2] > dmx){
					dmx = arfi[i][i2];
				}
				
				if (i == i2){
					diag += arfi[i][i2];
												//Главная диагональ, начальная тчк [0;0]
				}
				if (i+1==i2){					//Побочная диагональ, начальная тчк [0;1]
					diag2 += arfi[i][i2]; 
					
				}
				
				
			}
			System.out.println("\n");
		}
		System.out.printf("\nСумма чисел массива: %s\nСреднее арифметическое: %s\nНаибольшее число: %s\nСумма чисел по диагонали: %s\nСумма чисел побочной диагонали: %s", sum, ((double)sum)/((double)(rows*strg)), dmx, diag, diag2);
	}

}
