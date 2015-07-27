/*6. Написать статический метод, определяющий среднее арифметическое 
элементов передаваемого ему массива.*/
package Method;

public class method06 {

	public static void main(String[] args) {
		int array[] = new int [20], i = 0;
		for (; i < array.length; i++) {
			array [i] =(int)(Math.random()*100+0);
						
		}
		mean(array);
	}

	public static void mean (int ar []){
		int pos = 0, sum = 0;
		for (int i = 0; i < ar.length; i++) {
			pos++;
			  sum += ar [i];
		}
		
		System.out.printf("Среднее арифметическое: %s  ", ((double)(sum)/(pos)));
	}
}
