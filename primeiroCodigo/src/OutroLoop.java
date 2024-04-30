import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = Leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;  // == mediaAvaliacao = mediaAvaliacao + nota
                totalDeNotas++;
            }
        }

        System.out.println(String.format("Media da nota: %.1f", mediaAvaliacao/totalDeNotas));
}
}
