import java.io.IOException;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        int tamanho = st.length();

        int i = 0;
        for (int x = 0; x < tamanho; x++) {

            char n = st.charAt(x);
            if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' ||
                n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U') {
                i++;
            }
        }
        
        System.out.println("N° de vogais: " + i); 
        
    }
}