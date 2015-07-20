/*12. Создать два массива A и B по 5 элементов. Создать третий массив C на 10 элементов, в 
который копируются элементы из первого и второго массива поочередно (например, 
С[0]=A[0], c[1]=B[0], C[2]=A[1], C[3]=B[1] и тд).*/
package dz2_2;

public class dz2_12 {

	public static void main(String[] args) {
		int arA[] ={10, 20, 30, 40, 50}, arB[] = {60, 70, 80, 90, 100}, arC[] = new int [10];
		
		for(int i = 0, j = 1; i< arC.length/2; i++, j+=2){
			arC[j] = arA[i]; 		
			arC[j-1] = arB[i]; 
			/*if(i%2 == 0){
			arC[i] = arA[i]; 
			}else if (i%2 != 0 &&i < arC.length/2) arC[i] = arB[i];
			
			
			if(i%2 == 0 && i < arC.length/2){
				arC[i] = arA[i]; 
				}else if (i%2 != 0 &&i < arC.length/2) arC[i] = arB[i];*/
				
			
		}
			for (int k =0; k<arC.length;k++)
			
			System.out.print(arC [k]+" ");
	}

}
