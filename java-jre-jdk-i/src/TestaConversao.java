public class TestaConversao {

    public static void main(String[] args) {
        double salario = 1270.50;
        //int valor = salario;
        //o java não consegue converte automaticamente
        //usa o type casting que irá forçar o conversão
        int valor = (int) salario;

        System.out.println("Salário convertido para int: " + valor);

        //será convertido (implícita) para 3.0 automaticamente
        double valorTeste = 3;

        //no tipo long, é necessário colocar o L no final
        long numeroGrande = 32432423523L;
        //tipo short é de 16 bits, e é menor que o int
        short valorPequeno = 2131;
        //tipo byte é de 8 bits, e é menor que o short
        byte b = 127;

        double valor1 = 0.2;
        double valor2 = 0.1;
        //resultado 0.30000000000000004 pois segue a especificação IEE754
        double total = valor1 + valor2;

        //3.14 é um double com 64 bits
        float pontoFlutuante = 3.14f;
    }

}
