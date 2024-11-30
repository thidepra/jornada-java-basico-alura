public class TestaComposicaoObjetos {

    public static void main(String[] args) {
        Cliente bianca = new Cliente();
        bianca.setNome("Bianca Souza");
        bianca.setCpf("111.111.111-11");
        bianca.setProfissao("programadora");

        Conta contaDaBianca = new Conta();
        contaDaBianca.deposita(1000);

        //composição de objetos - contaDaBianca.titular é uma referência para o objeto bianca
        contaDaBianca.titular = bianca;
        System.out.println(contaDaBianca.titular.getNome());
        System.out.println(contaDaBianca.titular);
        System.out.println(bianca);
        //contaDaBianca.titular e bianca são referências para o mesmo objeto

        //pode ser feito em uma linha, sem precisar da criação de uma variável
        Conta contaDoPedro = new Conta();
        contaDoPedro.titular = new Cliente();

    }

}
