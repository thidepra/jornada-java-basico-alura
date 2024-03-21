public class TestaCondicional {

    public static void main(String[] args) {

        System.out.println("---- Testando condicionais ----");
        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2; //posso colocar uma expressão booleana ou só true/false

        System.out.println("Valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) { //é a mesma coisa que colocar acompanhado == true, pois o acompanhado já é um boolean
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }

}

