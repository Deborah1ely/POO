import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Agenda agenda = new Agenda();

        Pessoa p = new Pessoa();
        p.nome = "Deborah";
        p.addContato(true,false,"49 99999999");
        p.addContato(false,true,"49 99999999");
        p.dtNasc=new Data(11,9,2001);
        agenda.adicionarPessoa(p);

        agenda.listarPessoas();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa para buscar: ");
        String nomeBusca = scanner.nextLine();

        Pessoa encontrada = agenda.buscarNome(nomeBusca);
        if (encontrada != null) {
            System.out.println("Pessoa encontrada:");
            encontrada.imprimePessoa();
        } else {
            System.out.println("Pessoa não encontrada.");
        }

    }

    }