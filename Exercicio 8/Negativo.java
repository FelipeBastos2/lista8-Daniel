/*. Faça um programa, com uma função que necessite de um argumento. A
função retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se
seu argumento for zero ou negativo.
 */

import java.util.Scanner;

public class Negativo {
   

    public static char Negativo(int numero) {
        if (numero < 1) {
            return 'N';       
}
        else{
            return 'P';      
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        char resultado = Negativo(numero);
            System.out.println("O reultado é: " +resultado);
        scanner.close();

    }

}
