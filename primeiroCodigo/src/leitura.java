import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {

        Scanner Leitura = new Scanner(System.in);
        System.out.println("DIGITE SEU FILME FAVORITO: ");
        String filme = Leitura.nextLine();


        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = Leitura.nextInt();

        System.out.println("Avalia o filme de 0 a 10: ");
        double avaliacao = Leitura.nextDouble();

        System.out.println(String.format("Você avaliou o filme %s, lançado em %d, em %.1f", filme, anoDeLancamento, avaliacao));
    }
}
