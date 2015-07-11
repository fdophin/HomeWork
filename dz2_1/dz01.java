package dz2_1;

public class dz01 {
	 
	public static void main(String[] args) {
		int even = 0, negative = 0, positive = 0 , zero = 0;
		
		for (int i = 0; i<200; i++){
			int ra = (int)(Math.random()*200+(-100));
			
			
			if (ra == 0)
				zero++; 
				else if (ra < 0)
					negative++;
					else
						positive ++;
							if (ra%2 == 0) even++;
		
							
	}
		
		//System.out.println("\nЧетные " + ((double)even)/200*100 + "\nПоложительные " + ((double)positive)/200*100 + "\nОтрицательные " + ((double)negative)/200*100 + "\nНули " + ((double)zero)/200*100);
		System.out.printf("В диапазоне от -100 до 100 случайных чисел (в процентах): \n\nЧетные\t\t%s\nНечетные \t%s\n--------------------\nПоложительные \t%s \nОтрицательные \t%s  \nНули \t\t%s", ((double)even)/200*100, 100-(((double)even)/200*100), ((double)positive)/200*100, ((double)negative)/200*100, ((double)zero)/200*100);
	}
	
}