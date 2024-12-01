public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;

    public Conta() {
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //metodo void não retorna nenhum valor mas pode alterar o estado do objeto, ou seja, alterar os valores dos atributos
    public void deposita(double valor) {
        this.saldo += valor;
    }

    //metodo com return deve retornar um valor, ou seja, esse valor será usado em alguma operação
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
}
