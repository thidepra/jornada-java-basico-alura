public class TestaBanco {

    public static void main(String[] args) {
        Cliente thiane = new Cliente();
        thiane.nome = "Thiane Deprá";
        thiane.cpf = "111.111.111-11";
        thiane.profissao = "programadora";

        Conta contaDaThiane = new Conta();
        contaDaThiane.deposita(1000);

        //Associa a cliente Thiane com a conta contaDaThiane - composição
        contaDaThiane.titular = thiane; //é a composição dos objetos
        System.out.println(contaDaThiane.titular.nome);
        System.out.println(contaDaThiane.titular);
        System.out.println(thiane); //contaDaThiane.titular e thiane são referências para o mesmo objeto

    }

}
