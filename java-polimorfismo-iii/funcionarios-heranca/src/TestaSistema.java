public class TestaSistema {

    public static void main(String[] args) {
        Gerente ge = new Gerente();
        ge.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        SistemaInterno si = new SistemaInterno();
        si.autentica(ge);
    }

}
