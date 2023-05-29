//Faça um programa que receba o preço de custo de um produto e mostre o
//valor de venda. Sabe-se que o preço de custo receberá um acréscimo de
//acordo com um percentual informado pelo usuário.

import java.io.PrintStream;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out, true, UTF_8);

        out.println("O valor de custo do produto é:");
        float valorProduto = scanner.nextFloat();
        out.println("Informe o acrescimo percentual: ");
        float acrescimoPercentual = scanner.nextFloat();
        float acrescimo = valorProduto * (acrescimoPercentual / 100);
        float valorFinal = valorProduto + acrescimo;
        out.println("O valor total ficou de:" + valorFinal);
    }
}
