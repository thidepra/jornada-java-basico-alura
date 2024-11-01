public class TestaReferencias {

    public static void main(String[] args) {
        //primeiraConta não é uma conta, é uma referência para uma conta
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(300);
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());

        //segundaConta é uma referência para a primeiraConta tbm
        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());

        segundaConta.deposita(200);
        System.out.println("Saldo da segunda conta + deposito: " + segundaConta.getSaldo());
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());

        if (primeiraConta == segundaConta) {
            System.out.println("***São a mesma conta***");
        } else {
            System.out.println("***Não são a mesma conta***");
        }

        System.out.println("Referência da primeira conta: " + primeiraConta);
        System.out.println("Referência da segunda conta: " + segundaConta);
    }

}
