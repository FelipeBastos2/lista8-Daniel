/*Faça um programa, com uma função que necessite de três argumentos, e que
forneça a soma desses três argumento */

import java.util.Scanner;

public class Argumentos {
    public static void main(String[] args) {
        
        System.out.println("Digite os numeros: ");
        somar();
    }

    public static void somar() {// ira somar diretamente os numeros
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();//input para ler os numeros inseridos
        System.out.println(x+y+z);//mostrar o resultado da soma
        scanner.close();
    }
}
