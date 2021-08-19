package saudacoes;
import java.util.Scanner;

public class saudacoes1 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Digite o seu idioma: ");
            String idiomas1 = scan.next();

            switch (idiomas1) {

                case "PORTUGUÊS":
                    System.out.println("Olá Mundo");
                    break;
                case "INGLES":
                    System.out.println("Hello World!");
                    break;
                case "TCHECO":
                    System.out.println("Helló Világ");
                    break;
                case "Húngaro":
                    System.out.println("Ahoj Steve");
                    break;

                default:
                    System.out.println("Digite um Idioma valido.");
            }
        }
    }
}