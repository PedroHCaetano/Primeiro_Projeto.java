import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("DIGITE SEU FILME FAVORITO: ");
        String filme = leitura.nextLine();


        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Avalia o filme de 0 a 10: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(String.format("Você avaliou o filme %s, lançado em %d, em %.1f", filme, anoDeLancamento, avaliacao));
    }
}
