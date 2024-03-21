public class TestaValores {

    public static void main(String[] args) {
        int primeiro = 5;
        int segundo = 7;
        System.out.println("Primeiro: " + primeiro);
        System.out.println("Segundo: " + segundo);

        segundo = primeiro;
        primeiro = 10;

        System.out.println("Segundo: " + segundo);
        System.out.println("Primeiro: " + primeiro);

        String saudacao = "Olá, meu nome é ";
        String nome = "Rômulo ";
        String continuacao = "e minha idade é ";
        int idade = 100;
        System.out.println(saudacao+nome+continuacao+idade);
    }

}
