package Task4;

public class Main {

    //5. Дана произвольная строка.
    //Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки. Например, "Hello" -> "HHeelllloo".
    public static void main(String[] args) {
        String str = "Hello world";
        StringBuilder strDouble = new StringBuilder();
        String[] strArray = str.split("");

        for (int i = 0; i < strArray.length; i++) {
            strDouble.append(strArray[i]+strArray[i]);
        }
        System.out.println(strDouble.toString());
    }
}
