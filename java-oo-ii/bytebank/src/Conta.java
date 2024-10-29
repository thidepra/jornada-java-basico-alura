public class Conta {

    private double saldo;
    int agencia;
    int numero;
    Cliente titular; //posso criar direto o cliente toda vez que criar uma conta: Cliente titular = new Cliente();

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    //get para poder pegar o valor do atributo privado saldo
    public double getSaldo(){
        return this.saldo;
    }

    /*setSaldo precisa? Não, pois o saldo não deve ser alterado num passe de
    mágica. Nesse caso os metódos deposita, saca e transfere já sõa responsáveis
    por alterar o saldo.*/


}
