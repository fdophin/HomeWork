package Temp;
import static java.lang.System.out;
public class temp01 {

	public static void main(String[] args) {
		int height = 5;
		int width = 5;
		int[][] mass = new int[height][width];
		boolean direction = true;
		for (int y = 0; y < height; y++) {
			if (direction) {
				for (int x = 0; x < width; x++)
					mass[y][x] = y * height + x + 1;
				direction = false;
			} else {
				for (int x = width - 1; x >= 0; x--)
					mass[y][x] = y * height + (width - x);
				direction = true;
			}
		}

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				out.print(mass[y][x] + "\t");
			}
			out.println();
		}
		
	}

}
