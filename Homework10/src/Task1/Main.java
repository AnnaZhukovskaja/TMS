package Task1;

public class Main {
    // Написать программу по условию ниже:
    //На вход передать строку (будем считать, что это номер документа).
    //Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
    //Все эти методы реализовать в отдельном классе в статических методах,
    //которые на вход (входным параметром) будут принимать вводимую на вход
    //программы строку.
    public static void main(String[] args) {

        String numberOfDocument = "1111-aAa-2222-bBb-3c3C";
        System.out.println("Строка: " + numberOfDocument);

        //- 1.Вывести на экран в одну строку два первых блока по 4 цифры.
        CheсkingString.cheсking1(numberOfDocument);

        //- 2.Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
        StringBuilder numberOfDocumentTwo = new StringBuilder("1111-aAa-2222-bBb-3c3C");
        CheсkingString.cheсking2(numberOfDocumentTwo);

        //- 3.Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        String numberOfDocumentThree = "1111-aAa-2222-bBb-3c3C";
        CheсkingString.cheсking3(numberOfDocumentThree);

        //4.- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса
        //   StringBuilder).
        CheсkingString.cheсking4(numberOfDocumentThree);

        //- 5.Проверить содержит ли номер документа последовательность abc и вывеcти сообщение содержит или нет(причем, abc и ABC
        // считается одинаковой последовательностью).
        String numberOfDocumentFife = "1111-abc-2555-ABC-1a2b";
        CheсkingString.cheсking5(numberOfDocumentFife);

        //- 6.Проверить начинается ли номер документа с последовательности 555.
        //- Проверить заканчивается ли номер документа на последовательность 1a2b.
        CheсkingString.cheсking6(numberOfDocumentFife);
    }
}
