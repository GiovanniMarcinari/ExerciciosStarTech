package Lista02;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner_one = new Scanner(System.in);


        System.out.println("Insira a temperatura: ");
        double temperatura = Double.parseDouble(scanner_one.nextLine());

        System.out.println("Insira a unidade: ");
        String unidade = scanner_one.nextLine();

        double conversao;

        if(unidade.equals("C")) {
            conversao = temperatura * 1.8 + 32;
            System.out.printf(
                    "A temperatura informada foi %.2fºC.\n" +
                            "Equivale a %.2fºF.",
                    temperatura, conversao
            );
        } else if(unidade.equals("F")) {
            conversao = (temperatura - 32) / 1.8;
            System.out.printf(
                    "A temperatura informada foi %.2fºF.\n" +
                            "Equivale a %.2fºC",
                    temperatura, conversao
            );
        } else {
            System.out.printf("O caracter '%s' não corresponde a uma unidade de medida de temperatura.", unidade);
        }
    }
}