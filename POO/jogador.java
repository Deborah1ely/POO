//Exercicio 1
import java.io.IOException;
public class jogador{
    String nome;
    String posicao;
    Data dataNascimento;
    String nacionalidade;
    float altura;
    float peso;

    int idadeJogador(){
        return dataNascimento.intervaloAnos(8, 9, 1950);
    }
}