/*19. Скоро ведь Новый год! Необходимо срочно нарисовать ёлочку. С клавиатуры вводится 

количество ярусов, и высота каждого яруса ёлочки. Например, на картинке 4 яруса, 

высота каждого яруса – 5 символов.*/
package dz2_1;

import java.util.Scanner;

public class dz19 {

	public static void main(String[] args) {
		
		int yarus_count = 5;
		int yarus_height = 5;

		int maximal_width = yarus_height + yarus_count * 2;

		int spaces = maximal_width / 2 + yarus_height / 2 - 1
				+ (yarus_height % 2 - 1);
		int stars = 1;
		for (int a = 0; a < yarus_count; a++) {
			for (int y = 0; y < yarus_height; y++) {
				for (int s = 0; s < spaces; s++)
					System.out.print("  ");
				for (int s = 0; s < stars; s++)
					System.out.print("<>");
				System.out.println();
				spaces--;
				stars += 2;
			}
			spaces += (yarus_height - 1);
			stars -= (yarus_height - 1) * 2;
		}
		int stvol = maximal_width / 5;
		if (stvol % 2 == 0)
			stvol++;
		for (int t = 0; t < yarus_count; t++) {
			for (int i = 0; i < (maximal_width - stvol) / 2 + yarus_height / 2
					- 1; i++)
				System.out.print("  ");
			for (int i = 0; i < stvol; i++)
				System.out.print("<>");
			System.out.println();
		}   
		

	}

}
