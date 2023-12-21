import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o nome de um filme");
        String filme = read.nextLine();

        System.out.println("Digite o ano de lançamento");
        int year = read.nextInt();

        System.out.println("Avalie o filme com uma nota");
        double rate = read.nextDouble();

        System.out.println("Filme: " + filme);

        System.out.println("Ano de lançamento: " + year);

        System.out.println("Nota: " + rate);

    }
}
