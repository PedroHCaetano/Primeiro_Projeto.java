import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Avalia o filme de 0 a 10: ");
            nota = Leitura.nextDouble();
            mediaAvaliacao += nota;  // == mediaAvaliacao = mediaAvaliacao + nota
        }

        
        double avaliacao =
}
