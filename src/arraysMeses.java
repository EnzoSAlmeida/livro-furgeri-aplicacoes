import java.util.Random;

import javax.swing.JOptionPane;

public class arraysMeses {

	public static void main(String[] args) {
		String[] meses = {"janeiro","fevereiro","Mar�o","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		
		Random random = new Random();
		
		int numero = random.nextInt(11);
		
		JOptionPane.showMessageDialog(null,"O m�s escolhido foi: "+meses[numero]);
		

	}

}
