public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    //static é um atributo da classe e não do objeto
    private static int total;

    //construtor não é metodo, uma rotina de inicialização
    public Conta() {
        //não é o ideal para uma conta ter o construtor padrão, mas ficará assim para os exemplos iniciais
    }

    public Conta(int agencia, int numero) {
        if (agencia <= 0 || numero <= 0) {
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        //this é uma referência ao objeto que está sendo instanciado
        this.agencia = agencia;
        this.numero = numero;
//        Conta.total++;
        total++;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    //não precisaria desses métodos set se tivesse apenas o construtor: public Conta(int agencia, int numero)
    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
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
