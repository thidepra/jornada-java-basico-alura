//não pode instanciar essa classe por ser abstrata
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    //se não tiver o construtor padrão, o java cria um padrão
    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //método abstrato e deve ser implementado nas classes filhas
    public abstract double getBonificacao();
}
