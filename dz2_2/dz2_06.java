/*6. Создать массив из 20 случайных чисел в диапазоне от -10 до 30. Написать программу, 
определяющую сумму элементов массива, находящихся в массиве после первого 
отрицательного элемента.*/
package dz2_2;

import java.util.Random;

public class dz2_06 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
/*		int array[] = new int [20], arrdex[] = new int [20], i = 0, sum = 0;
		
		for (; i < array.length; i++) {
			array [i] =(int)(Math.random()*41+(-10));
			
			arrdex[i] = (array [i]< 0)? i: 21;
			System.out.print(array [i]+"; ");
		}
		System.out.println();
		int min = arrdex[0];
		for (int i2 = 0; i2 < arrdex.length; i2++){
			if (arrdex[i2] < min)
				min = arrdex[i2]; 
		}
		
		for (int i3 = min+1; i3 < array.length; i3++){
			sum += array[i3];
		}
		System.out.println("Сумма чисел после первого отрицательного элемента в массиве = "+sum);*/
		
		// Так лучше:
		
		int array[] = new int [20], i = 0, sum = 0;		
		boolean negative_switch = false;  //Логический ключь
		for (; i < array.length; i++) {
			array [i] =(int)(Math.random()*41+(-10));
			System.out.print(array[i]+" ");
			if(!negative_switch){							
				if(array[i]<0) negative_switch = true; /* Сдесь ключь меняет свое значение на фолс, 
				при условии, когда отрицательное число будет обнаружено, со следующей итерации  
				начнет работать эльс*/
			} else sum += array[i];
		}System.out.println("\n"+sum);
		

}
	
}