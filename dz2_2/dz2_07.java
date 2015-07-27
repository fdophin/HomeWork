/*7. Создать массив из 20 случайных чисел в диапазоне от -30 до 10. Написать программу, 
определяющую сумму элементов массива, находящихся в массиве до первого 
положительного элемента.*/
package dz2_2;

public class dz2_07 {

	public static void main(String[] args) {
		int array[] = new int [20], i = 0, sum = 0;		
		boolean positive_switch = false;  
		for (; i < array.length; i++) {
			array [i] =(int)(Math.random()*41+(-30));
			System.out.print(array[i]+" ");
		if(!positive_switch && array[i]<= 0){ 
			sum+=array [i];
		} else positive_switch = true; 
		
		}
		System.out.println("\nСумма отрицательных чисел до первого положительного не включая ноль: "+sum);
	}

}
