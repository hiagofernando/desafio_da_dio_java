import java.util.Scanner;

public class condicionamenteRico {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();

    if (valorSaque <= saldoTotal) {
      int saldo = saldoTotal - valorSaque;
      System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
    } else {
      System.out.println("Saldo insuficiente. Saque nao realizado!");
    }
  }
}