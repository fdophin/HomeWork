/*4. Создать символьный массив из 100 случайных элементов. Определить, сколько в нём 
цифр, букв и знаков пунктуации.*/
package dz2_2;

public class dz2_04 {

	public static void main(String[] args) {
		int dsum=0, ssum=0, spsum=0;
		char arSym [] = new char [100]; 
		for (int i = 0; i < arSym.length; i++) {
			arSym [i] =(char)(Math.random()*100+(0));
			System.out.print(arSym [i]+ " ");
		
		
			 if ( Character.isDigit(arSym [i]) )dsum++; // System.out.print ("цифра");
			  else if ( Character.isLetter(arSym [i]) )ssum++; //System.out.print ("буква");
			  else spsum++; //System.out.print ("спецсимвол");
		
		}
		
		System.out.printf("\n\nВ массиве:\nЧисел: %s\nБукв: %s\nСпецсимволов: %s", dsum, ssum, spsum);
		
	}
	
	
}
