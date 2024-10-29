public class TesteIfIR8 {

    public static void main(String[] args) {
        double salario = 3300.0;

        if (salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("A alíquota do IR é 7,5% e o desconto é de R$ 142,00.");
        } else if (salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("A alíquota do IR é 15% e o desconto é de R$ 350,00.");
        } else if (salario >= 3751.01 && salario <= 4664.00) {
            System.out.println("A alíquota do IR é 22,5% e o desconto é de R$ 636.");
        } else {
            System.out.println("Você é isento do IR!");
        }
    }

}
