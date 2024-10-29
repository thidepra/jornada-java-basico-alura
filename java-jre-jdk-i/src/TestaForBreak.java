public class TestaForBreak {

    public static void main(String args[]) {
        for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if ( coluna > linha) {
                    break;
                }
                int numero = coluna + 1;
                System.out.print(numero);
            }
            System.out.println();
        }
    }

}
