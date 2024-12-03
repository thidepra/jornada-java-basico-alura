public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta();
//        conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente bianca = new Cliente();
        //até aqui a classe conta e a cliente não se conhecem
//        conta.titular = bianca;
        //composição de objetos
        conta.setTitular(bianca);
        bianca.setNome("Bianca Silva");
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("developer");
        //pode ser em duas linhas, usando uma variável auxiliar
        Cliente titularDaConta = conta.getTitular(); //pegando a referência do objeto Bianca
        titularDaConta.setProfissao("developer");

        //todos estão apontando para a mesma referência
        System.out.println(titularDaConta);
        System.out.println(bianca);
        System.out.println(conta.getTitular());
    }

}
