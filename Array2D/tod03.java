/*3. Дан двумерный массив размерностью 5х5, заполненный случайными числами из 
диапазона от -5 до 5. Определить количество положительных, отрицательных и 
нулевых элементов.
*/
package Array2D;

public class tod03 {

	public static void main(String[] args) {
		int  strg = 5, rows = 5, plus = 0, minus =0;
		int arfi[][] = new int[rows][strg];
		for (int X= 0; X < arfi.length; X++) {
			for (int Y = 0; Y < arfi.length; Y++) {
				
				arfi[X][Y] = (int)(Math.random()*12+(-6));
				System.out.print(arfi[X][Y] + "\t");
				if(arfi[X][Y]>0){plus++;
				}else if (arfi[X][Y]<0) minus++;
				
			}
			System.out.println();
		}	
		System.out.printf("\nПоложительных: %s\nОтрицательных: %s\nНулей: %s", plus, minus, Math.abs((plus+minus)-(strg*rows)));
	}

}
