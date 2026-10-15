import java.util.List;

public class AnimeService {

    private static final List<String> CATALOGO = List.of(
            "dragon ball", "naruto", "bleach", "one piece", "attack on titan"
    );

    static String buscarAnimeFavorito(String nome) throws Exception {

        System.out.println("Consultando banco de dados...");

        if (!CATALOGO.contains(nome.trim().toLowerCase())) {
            throw new Exception("Anime \"" + nome + "\" não encontrado no banco de dados.");
        }

        return nome;
    }

    static void listarRecomendacoes(String anime) {

        List<String> recomendacoes;

        if (anime.equalsIgnoreCase("Dragon Ball")) {
            recomendacoes = List.of("Naruto", "Bleach", "Yu Yu Hakusho");
        } else if (anime.equalsIgnoreCase("Naruto")) {
            recomendacoes = List.of("Dragon Ball Z", "Bleach", "Hunter x Hunter");
        } else {
            recomendacoes = List.of("One Piece", "Demon Slayer", "Attack on Titan");
        }

        System.out.println("\nAnimes recomendados com base em \"" + anime + "\":");
        recomendacoes.forEach(a -> System.out.println("- " + a));
    }
}
