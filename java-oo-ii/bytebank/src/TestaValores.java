public class TestaValores {

    public static void main(String[] args) {
        //os parentes invocam o construtor
        Conta conta = new Conta(1337, 24226);

        //conta inconsistente com a regra de negócio
//        conta.setAgencia(-50);
//        conta.setNumero(-330);
        //imprimi 0, pois não foi atribuído nenhum valor e pega o valor padrão
        System.out.println(conta.getAgencia());

        //chama a referência
        conta.setAgencia(123443);

        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(1337, 14660);

        //preciso chamar a classe toda e não o objeto conta 1 por exemplo
        System.out.println(Conta.getTotal());
    }

}
