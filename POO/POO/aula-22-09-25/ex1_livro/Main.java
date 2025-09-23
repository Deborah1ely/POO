public class Main{
    public static void main(String[] args){

        Livro livro = new Livro();
        livro.imprimeLivro();
        livro.titulo = "Relatos de um gato viajante";
        livro.autor = "Hiro Arikawa";
        livro.anoPublicacao= 2017;

        livro.imprimeLivro();

    }}