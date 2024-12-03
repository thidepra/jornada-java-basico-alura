public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.getSaldo());

        //null é o valor padrão de um objeto não inicializado
        System.out.println(contaDaMarcela.getTitular());
        //null pointer exception, pois a referência titular é null, ou seja, não aponta para nenhum objeto.
        contaDaMarcela.getTitular().setNome("Marcela");
        System.out.println(contaDaMarcela.getTitular().getNome());
    }

}
