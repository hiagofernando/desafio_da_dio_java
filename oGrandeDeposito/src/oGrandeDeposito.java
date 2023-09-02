import java.util.Scanner;
import java.text.DecimalFormat;

public class oGrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("Deposito realizado com sucesso!\r\n" +
                    "Saldo atual: R$ " + df.format(valor));

        } else if (valor < 0) {
            System.out.print("Valor invalido! Digite um valor maior que zero.");

        } else {
            System.out.print("Encerrando o programa...");
        }
    }
}