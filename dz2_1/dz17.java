/*17. Пользователь указывает с клавиатуры нечётное число. Рисуется фигура с заданной 
стороной:*/

package dz2_1;

import java.util.Scanner;

public class dz17 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Введи нечетное число для стороны фигуры: ");
		int w = sn.nextInt(), h = w, x = 0, y = 0;
       
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x == y || x == 0 && y < h/2 || y == 0 && x < w/2 || x == w-1 && y >= h/2 || y == h-1 && x >= w/2 ){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                }
                
           }
            System.out.println();

        }
		System.out.println();
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x+y == h-1 || x == 0 && y >= h/2 || y == 0 && x >= w/2 || x == w-1 && y <= h/2 || y == h-1 && x <= w/2 ){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                }
                
           }
            System.out.println();

        }
		
		//--------------Прямоугольники, правая и левая диагонали----------------
		
		
		System.out.println();
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x == y || x == 0  || y == 0 || x == w-1  || y == h-1){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                }
                
           }
            System.out.println();

        }
		System.out.println();
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x+y == h-1 || x == 0 || y == 0  || x == w-1 || y == h-1){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                }
                
           }
            System.out.println();

        }
		//----------------Вертикаль - горизонталь-----------------------
		
		System.out.println();
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x == 0  || y == 0 || x == w-1  || y == h-1|| x == h/2  || y == h-1){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                }
                
           }
            System.out.println();

        }
		System.out.println();
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x == 0  || y == 0 || x == w-1  || y == h-1|| y == w/2  || y == h-1){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                }
                
           }
            System.out.println();

        }
		System.out.println();
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x == 0  || y == 0 || x == w-1  || y == h-1|| y == w/2  || x == h/2){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                }
                
           }
            System.out.println();

        }
		
		
		
		//-----------Пересеченные диагонали-----------
		
		System.out.println();
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x+y == h-1 || x == y || x == 0  || y == 0 || x == w-1  || y == h-1){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                }
                
           }
            System.out.println();

        }
		System.out.println();
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x == y || x+y == h-1 || x == 0 || x == w-1){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                }
                
           }
            System.out.println();

        }
		System.out.println();
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x+y == h-1 || x == y || y == 0 || y == h-1){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                }
                
           }
            System.out.println();

        }
		
		//------------Кольца----------
		
		System.out.println();
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x == 0 && y < h/2 && y >0|| y == 0 && x < w/2 && x > 0 || x == w-1 && y > h/2 && y<h-1 || y == w/2 && x>0 && x<w-1 && x != h/2 || y == h-1  && x >= w/2+1 && x<h-1 || x == h/2 && y < h-1 && y > 0 && y != w/2){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                }
                
           }
            System.out.println();

        }
		
		System.out.println();
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x == 0 && y > h/2 && y < h-1|| y == h-1 && x < w/2 && x > 0 || x == w-1 && y < h/2 && y > 0 || y == w/2 && x>0 && x<w-1 && x != h/2 || y == 0  && x >= w/2+1 && x<h-1 || x == h/2 && y < h-1 && y > 0 && y != w/2){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                }
                
           }
            System.out.println();

        }
		
		//---------------------------
		
	}
	}


