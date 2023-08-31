import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();

    //Entrada dos tipos de ativos
        int quantidadeAtivos = scanner.nextInt();
        //Limpa o buffer
        scanner.nextLine();
        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }

        //TODO: Ordenar os ativos em ordem alfabética.
        //exitem varias formas de ordenar listas em java, se você conhece as colections pode implementar Essa biblioteca Collections
        Collections.sort(ativos);
        //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        //aqui também usei strems para imprimir a lista ordenada, se não ficou claro você pode fazer o seguinte é a mesma coisa:
        //for (int i = 0; i < ativos.size(); i++) {
        //System.out.println(ativos.get(i));
       // }  
        ativos.forEach(s -> System.out.println(s));
  }
}