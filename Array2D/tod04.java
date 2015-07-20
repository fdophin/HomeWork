/*4. Дан двумерный массив размерностью 5х5, заполненный случайными числами из 
диапазона от 0 до 20. Определить сумму по каждой строке массива.*/

package Array2D;

public class tod04 {

	public static void main(String[] args) {
	//4е и 5е задание в одном.
		int  strg = 5, rows = 5, j = 0, str = 0, stolb = 0;
		int arfi[][] = new int[rows][strg];
		for (int X= 0; X < arfi.length; X++) {
			
			for (int Y = 0; Y < arfi.length; Y++) {
				
				arfi[X][Y] = (int) (Math.random() * 21 + 0);
				System.out.print(arfi[X][Y] + "\t");	
					
			}
			System.out.println("\n");
			
		}
	    for(; j<arfi.length; j++){
	    	for (int i=0;i<arfi.length;i++){
        	str+=arfi[j][i]; 
        	stolb+=arfi[i][j];
	    	}               
        System.out.println("Сумма " +j+ "-ой Строки: " +str + " Столбца: "+stolb);
        str=0; stolb=0;
        }
   	}

}


