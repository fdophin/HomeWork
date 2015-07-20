package Array2D;

public class tod16 {

	public static void main(String[] args) {
		int N = 5, M = 6;
		int arfi[][]=new int[N][M];
		for (int X= 0; X < arfi.length; X++) {
			for (int Y= 0; Y < arfi.length; Y++){
				arfi[X][Y]= X*N+Y+1;
				System.out.print(arfi[X][Y] + "\t");
			}
			System.out.println();
		}
		

	}

}
