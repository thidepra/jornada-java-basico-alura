public class TestaForMultiploDe3 {

    public static void main(String[] args) {

        System.out.print("Os números múltiplos de 3 são: ");

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 3 == 0) {
                System.out.print(numero);
                if (numero == 99) {
                    System.out.print("");
                } else {
                    System.out.print(", ");
                }
            }
        }
        System.out.print(".");

    }

//    public static void main (String[] args) {
//        for (int i = 3; i < 100; i += 3) {
//            System.out.println(i);
//        }
//    }

}
