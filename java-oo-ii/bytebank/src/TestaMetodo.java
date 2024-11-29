public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        //não usar atributo direto e sim métodos da classe
        //contaDoPaulo.saldo = 101;
        contaDoPaulo.deposita(1000);
        System.out.println("Saldo da conta do Paulo:" + contaDoPaulo.getSaldo());

        boolean conseguiuSacar = contaDoPaulo.saca(200);
        System.out.println("Conseguiu sacar da conta? " + conseguiuSacar);
        System.out.println("Saldo da conta do Paulo após saque:" + contaDoPaulo.getSaldo());

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(5000);
        System.out.println("Saldo da conta da Marcela:" + contaDaMarcela.getSaldo());

        boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoPaulo);

        if (sucessoTransferencia) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Falha na transferência!");
        }

        System.out.println("Saldo da conta da Marcela após transferência:" + contaDaMarcela.getSaldo());
        System.out.println("Saldo da conta do Paulo após transferência:" + contaDoPaulo.getSaldo());

        contaDoPaulo.saca(101);
        System.out.println("Saque negativo: " + contaDoPaulo.getSaldo());
    }

}
