public class TestaEscopoWhile {

    public static void main(String[] args) {

        int contador = 0;
        int total = 0;

        while (contador <= 10) {
            //int total = 0; //ela é inicializada toda vez que entra no loop
            total += contador;
            //System.out.println(total);  //esse mostra toda as somatórias
            contador++;
        }
        System.out.println("Somatoria: "+ total); //esse mostra só o valor final

    }

}
