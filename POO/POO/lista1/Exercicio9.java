import java.io.IOException;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        System.out.println("1 Java atrapalha muita gente"); 

        for (int i = 2; i <= 100; i++) {
            String frase = i + " Java";
           
            for (int j = 0; j < i; j++) {
                frase += " atrapalham";
            }
            
            frase += " muita gente";
            
            System.out.println(frase);
        }
    }
}