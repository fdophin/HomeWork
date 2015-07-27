/*7. Написать статический метод, меняющий порядок следования элементов 
передаваемого ей массива на противоположный.*/

package Method;

public class method07 {

	
		public static void main(String[] args) {
			int array[] = new int [10], i = 0;
			for (; i < array.length; i++) {
				array [i] = i;
				System.out.print (array [i]+" ");				
			}
			System.out.println();
			
			mean(array);
			
		}

		public static void mean (int ar []){
			for (int i = ar.length -1; i >= 0; i--) {
				
				System.out.print (ar [i]+" ");
			}
			
			
		}

}
