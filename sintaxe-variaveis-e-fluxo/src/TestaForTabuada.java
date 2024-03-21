public class TestaForTabuada {

    public static void main(String[] args) {

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println("Tabuada do " + multiplicador);
            for (int multiplicando = 0; multiplicando <= 10; multiplicando++) {
                int produto = multiplicador * multiplicando;
                System.out.println(multiplicador + " x " + multiplicando + " = " + produto);
            }
            System.out.println(); //pula linha entre os multiplicadores
            
        }
    }
    
}
