//Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.).

public class ex02B {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }
}
