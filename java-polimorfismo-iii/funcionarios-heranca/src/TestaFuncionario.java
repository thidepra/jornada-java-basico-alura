public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Gerente();
        f1.setNome("Thiane");
        f1.setCpf("111.111.111-11");
        f1.setSalario(2600.00);

        System.out.println("Nome: " + f1.getNome());
        System.out.println("Bonificação: " + f1.getBonificacao());
    }

}
