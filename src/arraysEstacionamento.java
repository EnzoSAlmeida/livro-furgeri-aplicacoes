import javax.swing.JOptionPane;

public class arraysEstacionamento {

	public static void main(String[] args) {
		String[] estacionamento = new String[10];
		int chave = 1;
		int vaga = 0;

		while (chave != 0) {
			chave = Integer.parseInt(JOptionPane
					.showInputDialog("Digite 1-Entrada, 2-Saída, 3-Listar situação atual e 4-Encerrar programa"));

			if (chave == 1) {
				vaga = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua vaga"));
				estacionamento[vaga] = JOptionPane.showInputDialog("Digite a placa do carro");

			} else if (chave == 2) {
				vaga = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua vaga"));
				estacionamento[vaga] = null;

			} else if (chave == 3) {
				for (int i = 0; i < estacionamento.length; i++) {
					System.out.print(estacionamento[i]+ " ");
			}
			}else if(chave == 4){
				JOptionPane.showMessageDialog(null, "Programa encerrado, adeus!");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente");
			}

		}
	}
}
