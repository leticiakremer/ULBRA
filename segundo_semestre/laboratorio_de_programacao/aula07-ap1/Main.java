public class Main {
    public static void main(String[] args) {
        var geradorSenha = new GeradorSenha();
        var senha = geradorSenha.gerar();

        System.out.println(senha);
    }
}
