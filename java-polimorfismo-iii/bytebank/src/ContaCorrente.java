public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
        //precisa colocar o super para chamar o construtor padrão da classe mãe ou o especifico
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        double taxaSaque = valor + 0.2;
        return super.saca(taxaSaque);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
