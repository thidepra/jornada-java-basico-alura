public class TestaReferencias {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        //posso declarar uma variável mais genéricas que o gerente
        //Funcionario g1 = new Gerente(); //aqui temos o polimorfismo - duas maneiras de referenciar o objeto
        g1.setNome("Maria");
        g1.setSalario(5000.00);

        //teste dos tipos de referência
        //g1.autentica(2222);
        /*não funciona se a referencia for do tipo Funcionario pois o Java analisa o tipo da
         referência e não tem o método autentica na classe funcionario*/

        EditorVideo ev1 = new EditorVideo();
        ev1.setNome("Felipe");
        ev1.setSalario(2500.00);

        Designer d1 = new Designer();
        d1.setNome("Carolina");
        d1.setSalario(2000.00);

        ControleBonificacao controleBoni = new ControleBonificacao();
        controleBoni.registra(g1);
        controleBoni.registra(ev1);
        controleBoni.registra(d1);

        System.out.println("Soma " + controleBoni.getSoma());


    }

}
