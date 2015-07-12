/*8. Осуществить циклический сдвиг влево введённого числа на N разрядов (например, 
при сдвиге числа 12345 влево на 3 разряда получится число 45123).*/

package dz2_1;

import java.util.Scanner;

public class dz08 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		 System.out.print("Введи число: ");
		String s = sr.nextLine(); 
        System.out.print("Введи число для сдвига разрядов влево: ");    
        int n = sr.nextInt(), len = s.length();        
	        	for (int b=0; b<len; b++){ 
	            	if(b>n-1)				
	        	   	 System.out.print(s.charAt(b));
	            	}
	        	for (int a=0; a<len; a++){ 
	            	if(a<n)				
	        	   	 System.out.print(s.charAt(a));
	            	}
	  
	}

}
