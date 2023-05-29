//- Escrever uma programa em que leia dois valores para as variáveis A e B, e
//efetuar as trocas dos valores de forma que a variável A passe a possuir o valor
//da variável B e a variável B passe a possuir o valor da variável A. Apresentar
//os valores trocados.
//Lembrando que temos que ter 3 variáveis para que uma haja como variável
//de armazenamento, ou seja, para evitar que o valor original de a se perca é
//necessário associar a uma outra variável (denominada usualmente de
//variável auxiliar) tal valor, estabelecer uma associação de a com o valor em b
//e, por último, associar b ao valor "salvo" na variável auxiliar.

import java.io.PrintStream;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out, true, UTF_8);

        out.println("Valor A:");
        int a = scanner.nextInt();
        out.println("Valor B: ");
        int b = scanner.nextInt();

        int tempA = a;
        int tempB = b;
        a = tempB;
        b = tempA;
        out.println("Variável A com valor de B:" + a);
        out.println("Variável B com valor de A:" + b);
    }
}



