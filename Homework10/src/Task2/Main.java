package Task2;

public class Main {

    //2. Дана строка произвольной длины с произвольными словами.
    //Найти самое короткое слово в строке и вывести его на экран.
    //Найти самое длинное слово в строке и вывести его на экран.
    //Если таких слов несколько, то вывести последнее из них.
    public static void main(String[] args) {

        String text = "Найти самОЕ последнее длинное СЛОво и самое ПОСЛеднее короткое слово В строке ";
        text.trim();
        String[] textArray = text.split(" ");
        String minWord = textArray[0];
        String maxWord = textArray[0];


        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].length() <= maxWord.length()){
                maxWord = textArray[i];
            }
            if (textArray[i].length() >= minWord.length()){
                minWord = textArray[i];
            }
        }
        System.out.println(minWord);
        System.out.println(maxWord);


    }
}
