package principal;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Conta minhaConta = new Conta();
    Scanner scam = new Scanner(System.in);
    String nome;
    int conta, op;
    float saldodaConta, valor, limite;
    
    System.out.println("Entre com o nome do proprietário: ");
    nome = leitura.nextLine();

    System.out.println("Entre com o numero da conta: ");
    conta = leitura.nextInt();

    System.out.println("Entre com o Limite da conta: ");
    limite = leitura.nextFloat();

    System.out.println("Entre com o Valor inicial da conta: ");
    valor = leitura.nextFloat();

    System.out.println("Dados da conta:" + nome + "numero da conta bancaria: " + conta + "Limite da conta: " + limite + "Valor existente na conta: " + valor);

    
  }
} 

