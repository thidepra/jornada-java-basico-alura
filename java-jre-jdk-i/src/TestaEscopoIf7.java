public class TestaEscopoIf7 {

    public static void main(String[] args) {
        System.out.println("---- Testando escopo ----");
        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado;
        //vai dar erro, as variáveis devem ser sempre inicializadas
        //System.out.println(acompanhado);

        if (quantidadePessoas >= 2) {
             //boolean acompanhado = true;
            //só existe dentro do bloco
             acompanhado = true;
        } else {
            acompanhado = false;
        }
    }

}
