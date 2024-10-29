public class TestaFor12 {

    public static void main(String[] args) {
        //mesmo laço que foi feito no TestaWhile.java
        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(contador);
        }

        //não compila, pois a variável contador não existe fora do bloco do for
        //System.out.println(contador);
    }

}
