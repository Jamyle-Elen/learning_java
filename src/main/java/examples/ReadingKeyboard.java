package examples;

import java.util.Scanner;

public class ReadingKeyboard {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in); // in padrão é o proproip teclado
        System.out.println("Digite um número: ");
        int number01 = teclado.nextInt();
        System.out.println(number01);
        System.out.println("Digite uma palavra: ");
        String mensagem = teclado.next();
        System.out.println(mensagem);
        System.out.println("Digite outro número: ");
        int number02 = teclado.nextInt();
        System.out.println("Soma de number01 + number02 vale: " + (number01 + number02));
    }
}
