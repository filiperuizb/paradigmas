import java.util.Scanner;

public class SistemaAnimes {

    public static void main(String[] args) {

        System.out.println("Iniciando sistema de recomendação de animes...\n");

        System.out.print("Digite o seu anime favorito: ");
        Scanner scanner = new Scanner(System.in);
        String animeDigitado = scanner.nextLine();
        scanner.close();

        String animeSelecionado;

        try {

            animeSelecionado = AnimeService.buscarAnimeFavorito(animeDigitado);
            System.out.println("Anime encontrado: " + animeSelecionado);

        } catch (Exception e) {

            System.out.println("\nERRO: " + e.getMessage());
            System.out.println("Não foi possível recuperar o anime favorito.");
            System.out.println("Utilizando anime padrão: Dragon Ball.");

            animeSelecionado = "Dragon Ball";
        }

        AnimeService.listarRecomendacoes(animeSelecionado);

        System.out.println("\nO programa continuou sua execução.");
        System.out.println("Fim do programa.");
    }
}
