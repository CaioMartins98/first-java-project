public class Condicional {
    public static void main(String[] args) {

        boolean includePlan = false;
        double note1 = 9.5;
        double note2 = 9.2;
        double note3 = 9.5;
        double media = (note1 + note2 + note3)/3;
        System.out.println(media);
        int classification = (int) media/2;

        if(classification >= 4){
            System.out.println("Mais classificados");
        }else{
            System.out.println("Menos classificados");
        }

        if(includePlan){
            System.out.println("Filme liberado!");
        }else{
            System.out.println("Você não é premium :(");
        }
    }
}
