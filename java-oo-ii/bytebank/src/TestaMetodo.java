public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDaBianca = new Conta();
        //não usar atributo direto e sim métodos da classe
        //contaDoPaulo.saldo = 101;
        contaDaBianca.deposita(1000);
        System.out.println("Saldo da conta do Paulo:" + contaDaBianca.getSaldo());

        boolean conseguiuSacar = contaDaBianca.saca(200);
        System.out.println("Conseguiu sacar da conta? " + conseguiuSacar);
        System.out.println("Saldo da conta do Paulo após saque:" + contaDaBianca.getSaldo());

        Conta contaDoPedro = new Conta();
        contaDoPedro.deposita(5000);
        System.out.println("Saldo da conta da Marcela:" + contaDoPedro.getSaldo());

        boolean sucessoTransferencia = contaDoPedro.transfere(3000, contaDaBianca);

        if (sucessoTransferencia) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Falha na transferência!");
        }

        System.out.println("Saldo da conta da Marcela após transferência:" + contaDoPedro.getSaldo());
        System.out.println("Saldo da conta do Paulo após transferência:" + contaDaBianca.getSaldo());

        contaDaBianca.saca(101);
        System.out.println("Saque negativo: " + contaDaBianca.getSaldo());
    }

}
