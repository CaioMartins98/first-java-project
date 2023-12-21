public class Main {
    public static void main(String[] args) {

        String nameFilm = "Top Gun: Maverick";
        System.out.println("Esse é o ScreenMatch");
        System.out.println("Filme: " + nameFilm);

        int year = 2022;
        System.out.println("Ano de lançamento: " + year);

        boolean includePlan = false;
        System.out.println("Incluso no plano: " + includePlan);

        double note1 = 8.5;
        double note2 = 2.2;
        double note3 = 3.5;
        double media = (note1 + note2 + note3)/3;

        System.out.println("Média: " + media);

        String sinopse;
        sinopse = """ 
                Filme Top Gun: Maverick 
                blablablablablabla
                blablabla
                """;
        System.out.println("Sinopse: " + sinopse);

        int classification = (int) (media/2);

        System.out.println("Nota: " + classification);
    }
}