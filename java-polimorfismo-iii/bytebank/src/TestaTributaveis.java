public class TestaTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(333, 3333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto cal = new CalculadorImposto();
        cal.registra(cc);
        cal.registra(seguro);

        System.out.println("Total de imposto: " + cal.getTotalImposto());
    }

}
