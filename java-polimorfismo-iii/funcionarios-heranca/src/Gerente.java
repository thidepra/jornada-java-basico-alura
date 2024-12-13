//gerente é um funcionario e herda tudo do Funcionario
// gerente tbm assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel  {
    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador= new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do Gerente");
        //usa o super para chamar o método da classe pai, e não o this
        return super.getSalario();
    }
}
