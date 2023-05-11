package capitulo_03;

import javax.swing.JOptionPane;

public class NameDialog 
{

	public static void main(String[] args)
	 {
	 // pede para o usuário inserir seu nome 
	 String name = JOptionPane.showInputDialog("Qual seu nome?");
	
	 // cria a mensagemÿ
	 String message =
	 String.format("Bem Vindo, %s, a minha caixinha de mensagem!", name);
	
	 // exibe a mensagem para cumprimentar o usuário pelo nome
	 JOptionPane.showMessageDialog(null, message);
	 } // fim de main
}
