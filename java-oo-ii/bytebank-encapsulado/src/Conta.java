public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /*public Conta() {//construtor padrão que pode receber os atributos necessários para inicializar a classe
    }*/

    public Conta(int agencia, int numero){
        Conta.total++; //é para a classe e não uma referencia do objeto (this)
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }

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

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode valor <= 0");
            return;//posso não retornar nenhum valor pois é void
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (numero <= 0) {
            System.out.println("Não pode valor <= 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {//não podemos a
        return Conta.total;
    }
}
