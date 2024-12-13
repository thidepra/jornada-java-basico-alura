public class TestaReferencias {

    public static void main(String[] args) {
        //posso declarar uma variável mais genéricas que o gerente
        Gerente g1 = new Gerente();
        //polimorfismo - duas maneiras de referenciar o objeto
        //Funcionario g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.00);

        //teste dos tipos de referência
        //g1.autentica(2222);
        /*não funciona se a referencia for do tipo Funcionario pois o Java analisa o tipo da
         referência e não tem o metodo autentica na classe funcionario*/

        Funcionario ev1 = new EditorVideo();
        ev1.setNome("Anna");
        ev1.setSalario(2500.00);

        Designer d1 = new Designer();
        d1.setNome("Carolina");
        d1.setSalario(2000.00);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev1);
        controle.registra(d1);

        System.out.println("Soma " + controle.getSoma());
    }

}
