public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);//os parentes invocam o construtor

        System.out.println(conta.getAgencia());
        conta.setAgencia(123443); //chama a referência

        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(1337, 14660);

        System.out.println(Conta.getTotal());//preciso chamar a classe toda e não o objeto conta 1 por exemplo
    }

}
