public class TestaCondicional6 {

    public static void main(String[] args) {
        System.out.println("---- Testando condicionais ----");
        int idade = 20;
        int quantidadePessoas = 3;
        //posso colocar uma expressão booleana ou só true/false
        boolean acompanhado = quantidadePessoas >= 2;

        System.out.println("Valor de acompanhado = " + acompanhado);

        //é a mesma coisa que colocar acompanhado == true, pois o acompanhado já é um boolean
        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }
    }

}

