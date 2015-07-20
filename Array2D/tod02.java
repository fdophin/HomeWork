/*2. Дан двумерный массив размерностью 5х5, заполненный случайными числами из 
диапазона от 0 до 20. Определить сумму элементов, расположенных на главной 
диагонали, а также сумму элементов, расположенных на побочной диагонали.*/

package Array2D;

public class tod02 {

	public static void main(String[] args) {
		int  strg = 5, rows = 5, diag = 0, diag2 = 0;
		int arfi[][] = new int[rows][strg];
		for (int X= 0; X < arfi.length; X++) {
			
			for (int Y = 0; Y < arfi.length; Y++) {
				
				arfi[X][Y] = (int) (Math.random() * 21 + 0);
				System.out.print(arfi[X][Y] + "\t");
				
				if (X == Y){
					diag += arfi[X][Y]; //Главная диагональ, начальная тчк [0;0]
				}
				if (X+1==Y){			//Побочная диагональ, начальная тчк [0;2]
					diag2 += arfi[X][Y]; 
				}
				
			}
			System.out.println("\n");
		}
		System.out.println("\n"+diag+" "+ diag2);
	}

}
