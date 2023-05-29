//- Escrever um programa que leia o nome de um aluno e as notas das três
//provas que ele obteve no semestre. No final informar o nome do aluno e a
//sua média (aritmética).

import java.io.PrintStream;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out, true, UTF_8);

        out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        out.println("Digite sua primeira nota:");
        float nota1 = scanner.nextFloat();
        out.println("Digite sua segunda nota:");
        float nota2 = scanner.nextFloat();
        out.println("Digite sua terceira nota:");
        float nota3 = scanner.nextFloat();

        out.println("Seu nome:" +nome);
        out.println("Sua média é:" + (nota1 + nota2+ nota3) / 3);
    }
}
