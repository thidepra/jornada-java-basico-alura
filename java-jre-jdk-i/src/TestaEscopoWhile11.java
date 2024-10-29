public class TestaEscopoWhile11 {

    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while (contador <= 10) {
            //ela é inicializada toda vez que entra no loop, precisa estar fora do loop
            //int total = 0;
            total += contador;
            //este mostra o total a cada loop
            //System.out.println(total);
            contador++;
        }

        //este mostra só o valor final
        System.out.println("Somatoria: "+ total);
    }

}
