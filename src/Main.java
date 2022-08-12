import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        WordsChecker text = new WordsChecker("Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip " +
                "ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " +
                "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non " +
                "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        text.spliteText();
        System.out.println("Введите слово для поиска");
        String word = scanner.nextLine();
        text.hasWord (word);
        if (text.hasWord(word)) {
            System.out.println("Искомое слово " + word + " в тексте есть");
        } else {
            System.out.println("Искомого слова " + word + " в тексте нет");
        }
    }
}
