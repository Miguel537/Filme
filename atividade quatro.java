import java.util.Scanner;

class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    double somaDasAvaliacoes = 0;
    int totalDeAvaliacoes = 0;

    void avalia(int nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double retornaMedia() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        }
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public String toString() {
        return "Filme: " + nome + ", Ano: " + anoDeLancamento + ", Duração: " + duracaoEmMinutos + " minutos.";
    }
}

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Filme meuFilme = new Filme();
        meuFilme.nome = "Deadpool & Wolverine";
        meuFilme.anoDeLancamento = 2024;
        meuFilme.duracaoEmMinutos = 127;

        System.out.println(meuFilme);

        System.out.print("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();
        meuFilme.avalia(nota1);

        System.out.print("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();
        meuFilme.avalia(nota2);

        System.out.print("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();
        meuFilme.avalia(nota3);

        System.out.println("Soma das avaliações: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Média das avaliações: " + meuFilme.retornaMedia());

        scanner.close();
    }
}
