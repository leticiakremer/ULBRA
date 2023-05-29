public class Programa {
    public static void main(String[] args) {
        //criar a fração 5/2
        Fracao f1 = new Fracao();
        f1.definirValores(5, 2);
        //Criar a fração 1/7
        Fracao f2 = new Fracao();
        f2.definirValores(1, 7);
        //Multiplica as frações
        Fracao f3 = f1.multiplicar(f2);
        //Mostrar a fração
        System.out.println(f3.obterFracao());
        //Mostrar o valor da Fração
        System.out.println(f3.calcularValor());
    }
}
