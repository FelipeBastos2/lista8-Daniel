import java.util.Scanner;

/**
 * ExercicioN
 */
public class ExercicioN {

    public static void ExercicioN (int n){
        for( int i =1; i <= n; i++){
            for(int j=0;j <i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nuemro inteiro para n: ");
        int n = scanner.nextInt();

        //Vai chamar a função e imprimir >
        ExercicioN(n);

        scanner.close();
    }
}

