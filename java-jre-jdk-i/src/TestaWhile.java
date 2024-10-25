public class TestaWhile {

    public static void main(String[] args) {

        int contador = 0;

        while (contador <=10) {
            System.out.println(contador);//preciso colocar o contador para não ficar no loop infinito
            //contador = contador + 1;
            //contador += 1;
            contador++; //qdo chegar no contador = 11, ele tenta entrar no loop, mas não entra
            //++contador;
        }

        System.out.println(contador);

    }

}
