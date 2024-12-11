public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario func1 = new Gerente();
        func1.setNome("Bianca");
        func1.setCpf("111.111.111-11");
        func1.setSalario(2600.00);

        System.out.println("Nome: " + func1.getNome());
        System.out.println("Bonificação: " + func1.getBonificacao());
    }

}
