public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDaBianca = new Conta();
        //não usar atributo direto e sim métodos da classe
        //contaDaBianca.saldo = 500;
        contaDaBianca.deposita(1000);
        System.out.println("Saldo da conta do Bianca:" + contaDaBianca.getSaldo());

        boolean conseguiuSacar = contaDaBianca.saca(200);
        System.out.println("Conseguiu sacar da conta? " + conseguiuSacar);
        System.out.println("Saldo da conta do Bianca após saque:" + contaDaBianca.getSaldo());

        Conta contaDoPedro = new Conta();
        contaDoPedro.deposita(5000);
        System.out.println("Saldo da conta do Pedro:" + contaDoPedro.getSaldo());

        boolean sucessoTransferencia = contaDoPedro.transfere(3000, contaDaBianca);

        if (sucessoTransferencia) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Falha na transferência!");
        }

        System.out.println("Saldo da conta da Pedro após transferência:" + contaDoPedro.getSaldo());
        System.out.println("Saldo da conta do Bianca após transferência:" + contaDaBianca.getSaldo());

        System.out.println(contaDaBianca.saca(5000));
        System.out.println("Tentativa de saque negativo: " + contaDaBianca.getSaldo());
    }

}
