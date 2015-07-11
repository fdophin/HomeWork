/*4. Показать на экране прямоугольник размером MxN, состоящий из звёздочек. Затем 
сделать то же самое, но чтоб фигура внутри была пустая (остаётся только рамка).*/
package dz2_1;

public class dz04 {

	public static void main(String[] args) {
	 int vis = 9, shir = 15, x, y;
	    for(y = 0; y < vis; y++){
	        for(x = 0; x < shir; x++){
	        	System.out.print ("*");
	        }
	        System.out.println();
	    }
	 System.out.println("\n\n");
	    for(y = 0; y < vis; y++){
		    for(x = 0 ; x < shir; x++){
		           if(y == 0 || x == 0 || y == vis-1 || x == shir-1){
		    	   System.out.print ("*");
		           } else {
		        	   System.out.print (" ");  
		             }      
		     }
		    System.out.println();
	   }
	}

}
