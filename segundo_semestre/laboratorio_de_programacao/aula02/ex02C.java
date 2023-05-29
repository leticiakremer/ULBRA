//Começando em 0, imprima os números seguintes, enquanto a soma dos números já
//impressos for menor que 100.

public class ex02C {
    public static void main(String[] args) {
        int i = 0;
        int soma = 0;
        while (soma < 100) {
            System.out.println(i);
            i++;
            soma = soma + i;
        }
    }
}
