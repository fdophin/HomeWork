/*8. Создать статический метод, позволяющий вставлять в массив блок элементов 
(какой-то другой массив чисел), начиная с произвольного индекса.*/

package Method;

public class method08 {

	public static void main(String[] args) {
		int array[] = new int [10], arr[] = new int [10], i = 0;
		for (; i < array.length; i++) {
			array [i] = i;
			System.out.print (array [i]+" ");				
		}
		System.out.println();
		
		peregon(array, arr, 4, 9); // массивы - источник, приемник, стартовый, конечный индексы приемника.

	}

	
	public static void peregon (int ar [], int ar2 [], int start, int end){
		for (int i = 0; i < ar.length; i++) {
			if (i >= start  && i <= end)
			ar2[i] = ar[i];
			
			System.out.print (ar2 [i]+" ");
		}
	}
	
}
