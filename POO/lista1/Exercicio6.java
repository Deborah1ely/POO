import java.io.IOException;
import java.util.Scanner;

public class Exercicio6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nInvertido = 0;

        while (n != 0) {
            int i = n % 10;
            nInvertido = nInvertido * 10 + i;
            n = n/ 10;
        }

        System.out.println("Número invertido: " + nInvertido); 
        
    }
}