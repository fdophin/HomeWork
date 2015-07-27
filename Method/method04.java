package Method;

public class method04 {

	public static void main(String[] args) {
		int w = 13, h = w, x = 0, y = 0;
		System.out.println();
		for (y = 0; y < h; y++) {
            for (x = 0; x < w; x++) {
            if (x == 0  || y == 0 || x == w-1  || y == h-1 ||  x+1 <= y+(w-5)/2 && x+1+y+1 >= (w-5)/2 && x >= y-(w-5)/2 && x+y <= (w-5)+(w-5)/2-1  ){	    	
                    System.out.print("#");
                } else {
                    System.out.print(".");                       
                  }
                
           }
            System.out.println();

		}
	}
}
	
