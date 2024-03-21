public class TestaConversao {

    public static void main(String[] args) {

        double salario = 1270.50;
        int valor = (int) salario;

        /* int valor = salario;
        o java não consegue converte automaticamente
        usa o type casting que irá forçar o conversão
         */
        double valorTeste = 3; //será convertido (implícita) para 3.0 automaticamente

        System.out.println("Salário convertido para int: " + valor);

        long numeroGrande = 32432423523L; //temos que colocar o L no final
        short valorPequeno = 2131;
        byte b = 127;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2; //resultado 0.30000000000000004 pois segue a especificação IEE754

        float pontoFlutuante = 3.14f; //3.14 é um double com 64 bits

    }

}
