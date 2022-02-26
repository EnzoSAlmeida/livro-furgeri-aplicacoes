import java.util.Random;

public class arrayPixels {

	public static void main(String[] args) {

		Random random = new Random();
		int aleatorio = random.nextInt(255);

		int[][] pixels = new int[40][40];

		for (int i = 0; i < pixels.length; i++) {
			for(int j = 0; j < pixels.length;j++) {
				aleatorio = random.nextInt(255);
				pixels[i][j] = aleatorio;
			}
		}

		for (int i = 0; i < pixels.length; i++) {
			for(int j = 0; j < pixels.length;j++) {
				System.out.print(pixels[i][j]+" ");
	}
		}
		
		
	}
}

