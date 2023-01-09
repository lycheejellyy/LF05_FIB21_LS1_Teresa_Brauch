import java.util.Scanner;
public class Treppe {

	public static void main(String[] args) {
		
		Scanner tastatur = new Scanner(System.in);
		
		int height;
		int width;
		
		System.out.println("Treppenhöhe: ");
		height = tastatur.nextInt();
		System.out.println("Stufenbreite: ");
		width = tastatur.nextInt();
		
		
		
		int i;
		int j;
		int k;
		String stern = "*";
		for (i = 0; i < height; i++) {
			for (j = 0; j < height; j++) {
			if (i >= j) {
				for (k = 0; k < width; k++) {
					System.out.print(stern);
					}
				}
			}
			System.out.print("\n");
		}

	}
}




