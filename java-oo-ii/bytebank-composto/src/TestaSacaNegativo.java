public class TestaSacaNegativo {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(200));

        //conta.saldo -= 101; não devemos usar um atributo e sim trabalhar com os metódos da classe.
        conta.saca(101);
        System.out.println("Saque negativo: " + conta.getSaldo());

    }

}
