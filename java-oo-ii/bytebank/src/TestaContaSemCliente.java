public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println("Saldo: " + contaDaMarcela.getSaldo());

        System.out.println("Titular: " + contaDaMarcela.titular);

        contaDaMarcela.titular = new Cliente();//faz direto sem criar uma variável temporária

        contaDaMarcela.titular.nome = "Marcela";
        System.out.println("Nome do titular: " + contaDaMarcela.titular.nome);
    }

}
