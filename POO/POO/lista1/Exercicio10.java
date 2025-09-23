import java.io.IOException;
import java.util.Scanner;

public class Exercicio10 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int valor = N;
        
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        
        for (int i : notas) {
            int qtd = N / i;
            N = N % i;
            System.out.println(qtd + " nota(s) de R$ " + i + ",00");
        }
 
    }
 
}