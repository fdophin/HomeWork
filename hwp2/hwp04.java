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
	       
	          
	        
	        /*2 Вариант:
	         * Scanner sr = new Scanner(System.in);
        
        String s = sr.nextLine(); // ввод 6 значного числа в строку
        String[] a = s.split(""); //перевод в массив символов
	        int m=0, v=0;
	        
	        for(int i=0;i<6;i++){ 
	            if(i<3){					// первые три числа
	        	m+=Integer.parseInt(a[i]); // извлечение из масива символов в число и сложение последующих между собой
	            } else v+=Integer.parseInt(a[i]); // последние три числа
	        }
	        boolean nowhere = m==v;	// сравнение
	        System.out.println(nowhere);*/ // вывод - истина или лож
		
		
	}

}
