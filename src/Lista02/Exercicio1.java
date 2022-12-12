package Lista02;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner_one = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        Double nota1 = Double.parseDouble(scanner_one.nextLine());

        System.out.println("Insira a segunda nota: ");
        Double nota2 = Double.parseDouble(scanner_one.nextLine());

        System.out.println("Insira a terceira nota: ");
        Double nota3 = Double.parseDouble(scanner_one.nextLine());

        System.out.println("Insira a quarta nota: ");
        Double nota4 = Double.parseDouble(scanner_one.nextLine());

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("As notas do aluno são: %.2f, %.2f, %.2f e %.2f.\n", nota1, nota2, nota3, nota4);
        System.out.printf("A média final é %.2f.\n", media);

        if(media >= 6) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
    }
}