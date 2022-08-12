import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private final String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    Set<String> set = new HashSet<>();

    //разбить текст на слова
    public void spliteText() {
        String[] words = text.split("\\P{Alpha}+");
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }
    }

    // метод проверки наличия слова в тексте
    public boolean hasWord(String word) {
        return set.contains(word);
    }
}
