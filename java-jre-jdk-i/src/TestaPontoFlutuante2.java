public class TestaPontoFlutuante2 {

    public static void main(String[] args) {
        double salario;
        salario = 1250.70;
        System.out.println("Meu salário é " + salario);

        //no java é comum declarar a variável e já atribuir o valor
        double idade = 37;

        double divisao = 3.14 / 2;
        System.out.println("Resultado de divisão = " + divisao);

        //o Java sempre truncará o resultado da divisão de inteiros
        int outraDivisao = 5 / 2;
        System.out.println("Resultado de outraDivisão = " + outraDivisao);

        //primeiro fazer o divisão de 2 inteiros e o resultado é um inteiro
        //pq o java primeiro faz a divisão e depois atribui o resultado a variável
        double novaTentativa = 5 / 2;
        System.out.println("Resultado de novaTentativa = " + novaTentativa);

        //pelo menos um dos números tem que ser double para o resultado ser double
        double outraTentativa = 5.0 / 2;
        System.out.println("Resultado de outraTentativa = " + outraTentativa);
    }

}
