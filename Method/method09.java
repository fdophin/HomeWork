/*9. Создать статический метод, позволяющий удалять блок элементов 
(определённое количество), начиная с произвольного индекса массива.*/

package Method;

public class method09 {

	public static void main(String[] args) {
		int array[] = new int [20], i = 0;
		for (; i < array.length; i++) {
			array [i] = i;
			System.out.print (array [i]+" ");				
		}
		System.out.println();
		
		cleanArr(array, 7, 13);  // очистка массива: с - по, индексы.

	}

	
	public static void cleanArr (int ar [], int start, int end){
		for (int i = 0; i < ar.length; i++) {
			if (i >= start  && i <= end)
			ar[i] = 0;
			
			System.out.print (ar [i]+" ");
		}
	}

}
