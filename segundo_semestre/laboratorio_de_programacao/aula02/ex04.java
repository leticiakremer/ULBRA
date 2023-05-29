//Escrever um programa java que receba dois números e exiba o resultado da sua soma.

import java.io.PrintStream;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out, true, UTF_8);

        out.println("Digite o primeiro valor:");
        int num1 = scanner.nextInt();
        out.println("Digite o segundo valor:");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        out.println("A soma dos números é: " + soma);
    }
}
