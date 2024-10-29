public class TestaWhile10 {

    public static void main(String[] args) {
        int contador = 0;

        while (contador <=10) {
            //preciso ter um contador para não ficar em loop infinito
            System.out.println(contador);
            //contador = contador + 1;
            //contador += 1;
            //qdo chegar no contador = 11, ele tenta entrar no loop, mas não entra
            contador++;
            //++contador;
        }

        //imprime 11
        System.out.println(contador);
    }

}
