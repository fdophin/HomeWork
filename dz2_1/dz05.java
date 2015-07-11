//Треугольник
package dz2_1;

import java.util.Scanner;

public class dz05 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Введи высоту треугольника: ");
		int h = sn.nextInt(), w = h*2, x, y;
        for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
                if (x == y+w/2 || x+y == w/2-1 || y == h-1) {
                    
                    System.out.print("#");
                } else {
                    System.out.print(" ");              
                }  
            }
            System.out.println();
        }
        System.out.println("\nЗаполненный:\n");
        
        for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
                if (x == y+w/2 || x+y == w/2-1 || y == h-1||x+y > w/2-1 && x < y+w/2 ) {
                    
                    System.out.print("#");
                } else {
                    System.out.print(" ");              
                }  
            }
            System.out.println();
        }  
	}
	

}
