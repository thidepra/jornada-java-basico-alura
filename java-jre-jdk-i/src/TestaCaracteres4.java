public class TestaCaracteres4 {

    public static void main(String[] args) {
        char letra = 'a';
        System.out.println(letra);

        //o tipo char guarda apenas um caractere da tabela unicode(numero)
        char valor = 66;
        System.out.println(valor);

        //valor = valor + 1; //não compila
        //temos que usar o casting
        //devido a regra do Java - quando se trabalha com dois tipos distintos na mesma operação, dará o resultado maior deles
        valor = (char) (valor + 1);
        System.out.println(valor);

        // String é somente com aspas duplas e aceita vazio, o char não
        String palavra = "Alura: cursos online de tecnologia";
        System.out.println(palavra);

        //string não se comporta como um char ou int, então a concatenação é feita
        palavra = palavra + 2020;
        System.out.println(palavra);
    }

}
