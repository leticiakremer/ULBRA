//Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o
//total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
//vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o
//seu nome, o salário fixo e salário no final do mês.

import java.io.PrintStream;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out, true, UTF_8);

        out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        out.println("Informe seu salário:");
        float salario = scanner.nextFloat();
        out.println("Informe seu valor total de vendas:");
        float vendas = scanner.nextFloat();

        float comissao = vendas * 0.15f;
        out.println(comissao + vendas);

        out.println("Nome:" + nome);
        out.println("Seu salário é de:" + salario);
        out.println("Sua comissão é de:" + comissao);
        out.println("Seu salário com a comissão é de:" + (salario + comissao));
    }
}

//1- Pedir o nome do vendedor, salário fixo, total de vendas em dinheiro.
//2- Calcular comissão
//3- Mostrar nome, salário fixo e salário com comissão.

