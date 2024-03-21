public class TestaPontoFlutuante {

    public static void main(String[] args) {

        double salario;
        salario = 1250.70;
        System.out.println("Meu salário é " + salario);

        double idade = 37; //comum é declara a variável e já atribuir o valor

        double divisao = 3.14 / 2;
        System.out.println("Resultado de divisão = " + divisao);

        int outraDivisao = 5 / 2;
        System.out.println("Resultado de outraDivisão = " + outraDivisao);

        double novaTentativa = 5 / 2; //primeiro fazer o divisão de 2 inteiros e depois atribuir a variável - devemos colocar um dos números com ponto flutuante
        System.out.println("Resultado de novaTentativa = " + novaTentativa);

        double outraTentativa = 5.0 / 2;
        System.out.println("Resultado de outraTentativa = " + outraTentativa);


    }

}
