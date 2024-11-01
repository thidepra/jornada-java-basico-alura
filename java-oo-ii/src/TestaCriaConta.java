public class TestaCriaConta {

    public static void main(String[] args) {
        //foi criado um objeto do tipo Conta, ou seja, uma instância da classe Conta
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(100);

        System.out.println("Saldo: " + contaDaMarcela.getSaldo());
        System.out.println("Agência: " + contaDaMarcela.getAgencia());
        System.out.println("Número: " + contaDaMarcela.getNumero());
        System.out.println("Titular: " + contaDaMarcela.titular);

        //faz direto sem criar uma variável temporária
        contaDaMarcela.titular = new Cliente();
        contaDaMarcela.titular.nome = "Marcela";

        System.out.println("Nome do titular: " + contaDaMarcela.titular.nome);
    }

}
