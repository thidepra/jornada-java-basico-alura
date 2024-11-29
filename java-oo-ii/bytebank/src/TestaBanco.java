public class TestaBanco {

    public static void main(String[] args) {
        Cliente bianca = new Cliente();
        bianca.nome = "Bianca Souza";
        bianca.cpf = "111.111.111-11";
        bianca.profissao = "programadora";

        Conta contaDaBianca = new Conta();
        contaDaBianca.deposita(1000);

        //Associa a cliente bianca com a conta contaDaBianca - composição
        contaDaBianca.titular = bianca; //é a composição dos objetos
        System.out.println(contaDaBianca.titular.nome);
        System.out.println(contaDaBianca.titular);
        System.out.println(bianca); //contaDaBianca.titular e bianca são referências para o mesmo objeto

    }

}
