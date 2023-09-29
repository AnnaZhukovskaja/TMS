package Task2;

public class Main {

    //2. Создать классы "Директор", "Рабочий", "Бухгалтер".
    //Реализовать интерфейс с методом, который печатает название
    //должности и имплементировать этот метод в созданные классы.
    public static void main(String[] args) {

        Printable director = new Director("Ivan", "Ivanov", 36, 15, "Minsk");
        director.print();
        Printable accountant = new Accountant( "Alla", "Pugacheva", 55, 25, 4);
        accountant.print();
        Printable laborer = new Laborer( "Vladimir", "Petrov", 48, 19, 3);
        laborer.print();
    }

}
