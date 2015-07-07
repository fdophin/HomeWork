/*2. Написать программу, выводящую на экран только четные целые числа из
диапазона от 1 до 100.*/
package dz2_0;

public class z_02 {
	
	public static void main(String[] args) {
		System.out.println("Программа показывает четные цифры от 1 до 100.");
		for (int i = 1; i < 100; i++){
			if ( i%2 != 0) continue; 
            System.out.print(i + ", ");
        }

	}

}
