public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lnaçamento que a galera está curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Assista agora!");
        } else {
            System.out.println("Alugue agora!");
        }
    }
}
