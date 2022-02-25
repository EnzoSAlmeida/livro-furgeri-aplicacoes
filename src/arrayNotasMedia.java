import java.util.Arrays;

import javax.swing.JOptionPane;

public class arrayNotasMedia {

	public static void main(String[] args) {
		int media = 0;
		int[] notas = new int[5];
		
		
		for(int i=0;i < notas.length;i++) {
			notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Forneça a "+(i+1)+" nota"));	
		}
		Arrays.sort(notas);
		
		for(int i = notas.length;i!=0 ;i--) {
			System.out.print(notas[i-1]+" ");
			media = notas[i-1]+media;
		}
		media = media / notas.length;
		
		JOptionPane.showMessageDialog(null, "A média é "+media);
	
	
	}
}