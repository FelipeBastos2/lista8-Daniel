/*Faça um programa para imprimir:
1
1 2
1 2 3
.....
1 2 3 ... n
para um n informado pelo usuário.
Use uma função que receba um valor n inteiro imprima até a n-ésima linha */

import java.util.Scanner;

public class Sequencia {
    
    public static void Sequencia (int seq){   
        for(int i = 1; i <= seq; i++){
            for(int j=1;j<=i ;j++){//<<imprimir o numero de 1 a i na msm linha
                System.out.print(j +" ");
            }
            System.out.println();
        }
      
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para a sequencia: ");
        int seq=scanner.nextInt();
        
        Sequencia(seq);
        scanner.close();
}


}