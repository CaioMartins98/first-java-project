import java.util.Scanner;



public class OutroLoop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        int totalNotas = 0;
        double mediaFinal = 0;

        while (nota != -1) {
            System.out.println("Avaliação: ");
            nota = read.nextDouble();

            if (nota != -1) {
                media += nota;
                totalNotas++;
            }
        }
        if (totalNotas == 0) {
            System.out.println("Média: " + 0);
        }else{
            System.out.println("Média: " + media / totalNotas);
        }

    }
}
