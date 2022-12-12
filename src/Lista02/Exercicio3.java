package Lista02;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        int idade;
        int parcelas;
        double salario;
        double emprestimo;
        double porcentagem;
        double valorParcela;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        idade = ler.nextInt();

        System.out.println("Informe o seu sálario: ");
        salario = ler.nextDouble();

        System.out.println("Informe o valor do empréstimo: ");
        emprestimo = ler.nextDouble();
        porcentagem = salario * 0.30;

        System.out.println("Informe em quantas parcelas você gostaria de pagar: ");
        parcelas = ler.nextInt();
        valorParcela = emprestimo / salario;

        if ((idade >= 18 && idade <= 65) && (parcelas >= 3 && parcelas <= 24) && (valorParcela >= porcentagem)) {
            System.out.printf("Você tem %d anos de idade e", idade);
            System.out.printf(" tem o salário de %.2f reais", salario);
            System.out.printf("\n O valor de empréstimo solicitado é de %.2f reais para ser pago em %d parcelas.", emprestimo, parcelas);
            System.out.println("\n O empréstimo foi aprovado com sucesso!");

        } else {
            System.out.printf("Você tem %d anos de idade e", idade);
            System.out.printf(" tem o salário de %.2f reais", salario);
            System.out.printf("\n O valor de empréstimo solicitado é de %.2f reais para ser pago em %d parcelas.", emprestimo, parcelas);
            System.out.println(" \n O empréstimo foi reprovado!");
        }
    }
}