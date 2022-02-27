import java.util.Random;

public class arrayParImpar {

	public static void main(String[] args) {
		int[] par = new int[10];
		int[] impar = new int[10];

		Random random = new Random();
		int aleatorio = random.nextInt(20);

		for (int i = 0; i < par.length; i++) {
			aleatorio = random.nextInt(20);
			if (aleatorio % 2 == 0) {
				par[i] = aleatorio;
			} else {
				impar[i] = aleatorio;
			}
		}
		System.out.print("Par:");
		for (int i = 0; i < par.length; i++) {
			System.out.print(par[i] + " ");
		}
		System.out.print("\nImpar:");
		for (int i = 0; i < impar.length; i++) {
			System.out.print(impar[i] + " ");
		}
	}
}
