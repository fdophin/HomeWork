package hwp2;


import java.util.Scanner;

public class hwp04 {

	public static void main(String[] args) {
			int n, n1, n2;
	       
	        System.out.print("Bведи 6 значное число билета: ");
	        Scanner sr = new Scanner(System.in);
	        n = sr.nextInt();  
	        
	       n1 = n % 1000;
	       n2 = (n - n1)/1000;     
	    
	       int i = n1;
	       int s = 0;
	       while (i != 0 ){
	            s +=i%10;
	            i /=10;
	        }
	       int i2 = n2;
	       int s2 = 0;
	       while (i2 != 0 ){
	            s2 +=i2%10;
	            i2 /=10;
	        }
	       if(s == s2 ) {
	    	   System.out.println("Счастливый билет!");   
	       } else { System.out.println("Обычный билет!");
	       	 }
	       
	          
	        
	        /*String s = sr.nextLine();
	        String[] a = s.split("");
	        int m=0;
	        for(int i=0;i<3;i++){
	            m+=Integer.parseInt(a[i]);
	        }
	        
	        System.out.println(m+"");*/
		
		
	}

}
