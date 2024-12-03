public class TestaCriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(300.0);
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
        segundaConta.deposita(300.0);
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());

        //Valores default para atributos primitivos
        System.out.println("Valor default para agecia: " + segundaConta.getAgencia());
        System.out.println("Valor default para número: " + segundaConta.getNumero());

        segundaConta.setAgencia(146);
        segundaConta.setNumero(4321);
        System.out.println("Agência da segunda conta: " + segundaConta.getAgencia());
        System.out.println("Número da segunda conta: " + segundaConta.getNumero());

        //Valores default para atributos de referência
        System.out.println("Valor default para titular: " + primeiraConta.getTitular());

    }

}
