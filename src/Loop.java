import java.lang.reflect.Array;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double rate = 0;
        double media = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Avalie o filme com uma nota");
            rate = read.nextDouble();

            media += rate;

        }
        System.out.println("media: " + media / 5);

    }
}
