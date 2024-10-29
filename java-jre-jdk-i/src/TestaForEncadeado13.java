public class TestaForEncadeado13 {

    public static void main(String[] args) {
        //laço externo
        for (int multiplicador = 1; multiplicador <=10 ; multiplicador++) {
            //laço interno
            for (int contador = 0; contador <=10 ; contador++) {
                System.out.print(multiplicador * contador);
                //a cada contador vai dar o espaço
                System.out.print(" ");
            }
            //a cada multiplicador vai pular a linha
            System.out.println();
        }
    }
    
}
