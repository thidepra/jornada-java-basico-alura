public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(330, 13376);
//        conta.numero = 1337;
        conta.setNumero(1337);//é a invocação do método

        System.out.println(conta.getNumero());// aqui preciso chamar o total da Classe total

        Cliente thiane = new Cliente();
//        conta.titular = paulo;
        conta.setTitular(thiane);
        thiane.setNome("Thiane Deprá");

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programadora");
        //agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programadora");

        System.out.println(titularDaConta);
        System.out.println(thiane);
        System.out.println(conta.getTitular());
        //todos estão apontando para a mesma referência
    }

}
