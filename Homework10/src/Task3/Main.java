package Task3;

public class Main {
    //3. Дана строка произвольной длины с произвольными словами.
    //Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры. Если таких слов
    // несколько, найти первое из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
    public static void main(String[] args) {

        String text = "fffff ab fjkjhg 1234 jkjk";
        System.out.println(text);

        MaxDiff.searchDiffWords(text);

    }
}
