public class TestaGerente {

    public static void main(String[] args) {

        Autenticavel referencia = new Cliente();

        Gerente g1 = new Gerente();
        g1.setNome("Paulo");
        g1.setCpf("222.222.222-22");
        g1.setSalario(5000.00);

        System.out.println("Nome: " + g1.getNome());
        System.out.println("CPF: " + g1.getCpf());
        System.out.println("Salário: " + g1.getSalario());

        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);

        System.out.println("Autenticou? " + autenticou);

        System.out.println("Bonificação: " + g1.getBonificacao());
    }

}
