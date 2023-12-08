package Task1;

public class CheсkingString {
    // Написать программу программу по условию ниже:
    // Все эти методы реализовать в отдельном классе в статических методах,
    // которые на вход (входным параметром) будут принимать вводимую на вход
    // программы строку.

    //- 1.Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void cheсking1(String numberOfDocument) {
        String numNewOne = numberOfDocument.substring(0, 4) + " " + numberOfDocument.substring(9, 13);
        System.out.println(numNewOne);
    }

    //- 2.Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    public static void cheсking2(StringBuilder numberOfDocument) {
        StringBuilder numNewTwo = numberOfDocument.replace(5, 8, "***").replace(14, 17, "***");
        System.out.println(numNewTwo);
    }

    //- 3.Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    public static void cheсking3(String numberOfDocument) {
        String numNewThree = numberOfDocument.substring(5, 8) + "/" + numberOfDocument.substring(14, 17) + "/" + numberOfDocument.substring(19, 20) + "/" + numberOfDocument.substring(21, 22) + "/";
        System.out.println(numNewThree.toLowerCase());
    }

    //4.- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса
    //   StringBuilder).
    public static void cheсking4(String numberOfDocument) {
        System.out.println("Letters:" + new StringBuilder(numberOfDocument.toUpperCase()));
    }

    //- 5.Проверить содержит ли номер документа последовательность abc и вывеcти сообщение содержит или нет(причем, abc и ABC
    // считается одинаковой последовательностью).
    public static void cheсking5(String numberOfDocument) {
        System.out.println("Содержит abc или ABC? " + (numberOfDocument.contains("abc") || numberOfDocument.contains("ABC")));
    }

    //- 6.Проверить начинается ли номер документа с последовательности 555.
    //- Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static void cheсking6(String numberOfDocument) {
        System.out.println("Содержит 555? " + numberOfDocument.contains("555"));
        System.out.println("Содержит 1a2b? " + numberOfDocument.contains("1a2b"));
    }
}
