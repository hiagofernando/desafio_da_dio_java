import java.text.DecimalFormat;
import java.util.Scanner;

public class jurosComposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        double = calcularInvestimento(valorInicial, taxaJuros, periodo);


        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}