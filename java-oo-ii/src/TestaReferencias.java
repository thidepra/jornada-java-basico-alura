public class TestaReferencias {

    public static void main(String[] args) {
        //primeiraConta é uma referência para um objeto do tipo Conta
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(300.0);
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());

        //Atribuição de referência
        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());

        segundaConta.deposita(100.0);
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());

        if (primeiraConta == segundaConta) {
            System.out.println("\n***São a mesma conta***");
        } else {
            System.out.println("***Não são a mesma conta***");
        }

        System.out.println("Referência da primeira conta: " + String.valueOf(primeiraConta));
        System.out.println("Referência da segunda conta: " + String.valueOf(segundaConta));
    }

}
