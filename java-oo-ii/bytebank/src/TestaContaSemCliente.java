public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.getSaldo());

        //null é o valor padrão de um objeto não inicializado
        System.out.println(contaDaMarcela.titular);
        //null pointer exception, pois a referência titular é null, ou seja, não aponta para nenhum objeto.
        contaDaMarcela.titular.setNome("Marcela");
        System.out.println(contaDaMarcela.titular.getNome());
    }

}
