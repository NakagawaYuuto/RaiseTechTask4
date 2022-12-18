import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> games = List.of("フォートナイト", "Apex", "ポケットモンスター", "エルデンリング", "モンスターストライク");

        //名前に「フォ』があるもの
        List<String> result = games.stream().filter(game -> game.contains("フォ")).toList();
        System.out.println(result);

        //並び替え
        List<String> result1 = games.stream().sorted().toList();
        System.out.println(result1);


    }
}
