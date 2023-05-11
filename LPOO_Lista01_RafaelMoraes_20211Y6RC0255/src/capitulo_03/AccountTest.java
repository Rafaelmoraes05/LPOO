package capitulo_03;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest
{
 public static void main(String[] args)
 {
	 Account account1 = new Account("Jane Green", 50.00);
	 Account account2 = new Account("John Blue", -7.53);
	 
	 displayAccount(account1);
     displayAccount(account2);
	 
  /*
	 // exibe saldo inicial de cada objeto
	 System.out.printf("%s balance: $%.2f %n",
	 account1.getName(),account1.getBalance());
	 System.out.printf("%s balance: $%.2f %n%n",
	 account2.getName(),account2.getBalance());
  */
     
	 Scanner input = new Scanner(System.in);
	 
	 System.out.print("Insira o valor do depósito para a conta1: "); 
	 double depositAmount = input.nextDouble(); // obtém a entrada do usuário
	 System.out.printf("%nAdicionando %.2f ao saldo da conta1%n%n", depositAmount);
	 account1.deposit(depositAmount); // adiciona o saldo de account1
	
  /*	
	 // exibe os saldos
     System.out.printf("%s balance: $%.2f %n",
	 account1.getName(),account1.getBalance());
	 System.out.printf("%s balance: $%.2f %n%n",
	 account2.getName(),account2.getBalance());
  */
	 displayAccount(account1);
     displayAccount(account2);
	 
	 System.out.print("Insira o valor do depósito para a conta2: "); // prompt
	 depositAmount = input.nextDouble(); // obtém a entrada do usuário
	 System.out.printf("%nAdicionando %.2f ao saldo da conta2%n%n", depositAmount);
	 account2.deposit(depositAmount); // adiciona ao saldo de account2
	 
  /*
	 // exibe os saldos
	 System.out.printf("%s balance: $%.2f %n",
	 account1.getName(),account1.getBalance());
	 System.out.printf("%s balance: $%.2f %n%n",
	 account2.getName(),account2.getBalance());
  */
	 //exibe os saldos
	 displayAccount(account1);
	 displayAccount(account2);
	 
	 // exibe as informações das contas em uma janela gráfica
	 displayAccountGrafico(account1);
	 displayAccountGrafico(account2);

 } 
 
 public static void displayAccount(Account accountToDisplay) 
 {
     System.out.printf("%s Saldo: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    
 }
 
 public static void displayAccountGrafico(Account accountToDisplay) 
 {
	    String texto = String.format("Nome: %s%nSaldo: $%.2f", accountToDisplay.getName(), accountToDisplay.getBalance());
	    JOptionPane.showMessageDialog(null, texto, "Informação da Conta", JOptionPane.INFORMATION_MESSAGE);
 }
 
}




