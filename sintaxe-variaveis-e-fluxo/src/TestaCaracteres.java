public class TestaCaracteres {

    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 66;
        System.out.println(valor);

        /*valor = valor + 1; //não compila
        temos que usar o casting
        devido a regra do Java - quando se trabalha com dois tipos distintos na mesma operação, dará o resultado maior deles
         */
        valor = (char) (valor + 1);
        System.out.println(valor);

        String palavra = "Alura: cursos online de tecnologia"; // String é somente com aspas duplas e aceita vazio, o char não
        System.out.println(palavra);

        palavra = palavra + 2020; //a string não se comporta como um char ou int
        System.out.println(palavra);

    }

}
