public class TestaForEncadeado {

    public static void main(String[] args) {

        for (int multiplicador = 1; multiplicador <=10 ; multiplicador++) { //laço externo
            for (int contador = 0; contador <=10 ; contador++) { //laço interno
                System.out.print(multiplicador * contador);
                System.out.print(" ");// a cada contador vai dar o espaço
            }
            System.out.println();//a cada multiplicador vai pular a linha
        }
    }
    
}
