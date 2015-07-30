package Method;




public class method11{

	
	
	public static void main(String[] args) {
		int coun = 30;
		for (int i = 0; i< coun; i++)
		System.out.println (fib(i));
									
		
	}
	
	public static int fib(int f) {
	    if(f <= 1) {
	    	return f;
	    } else {
	        return fib(f-1)+fib(f-2);
	    }
	    
	}
	

}

