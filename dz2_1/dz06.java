/*6. Написать программу, которая выводят на экран ромб (длины диагоналей ромба 

одинаковы по значению, но могут быть равны любому числу). Затем сделать то же 

самое, но чтоб фигура внутри была пустая (остаётся только контур).*/
package dz2_1;

public class dz06 {

	public static void main(String[] args) {
		int vis = 5, shir = 5, x, y;
		for(y = 0; y < vis; y++){
		    for(x = 0 ; x < shir; x++){
		           if(x <= y+shir/2 && x+y >= shir/2 && x >= y-vis/2 && x+y <= shir+vis/2-1){
		    	   System.out.print ("%");
		           } else {
		        	   System.out.print (" ");  
		             }      
		     }
		    System.out.println();
	   }
	 System.out.println("\n\n");
	    for(y = 0; y < vis; y++){
		    for(x = 0 ; x < shir; x++){
		           if(x == y+shir/2 || x+y == shir/2 || x == y-vis/2 || x+y == shir+vis/2-1 ){
		    	   System.out.print ("#");
		           } else {
		        	   System.out.print (" ");  
		             }      
		     }
		    System.out.println();
	   }

	}

}
