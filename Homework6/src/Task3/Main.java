package Task3;

public class Main {
//    2. Создать класс, описывающий банкомат.
//    Набор купюр, находящихся в банкомате, должен задаваться тремя
//    свойствами: количеством купюр номиналом 20, 50 и 100.
//    Сделать метод для добавления денег в банкомат.
//    Сделать функцию, снимающую деньги, которая принимает сумму денег, а
//    возвращает булевое значение - успешность выполнения операции.
//    При снятии денег функция должна распечатывать каким количеством
//    купюр какого номинала выдаётся сумма.
//    Создать конструктор с тремя параметрами - количеством купюр каждого
//    номинала.

    public static void main(String[] args) {

        Atm atmAlfa = new Atm(0, 0, 0);

        atmAlfa.addBanknotes(100, 100, 100);

        System.out.println("Withdrawal of money? " + atmAlfa.withdrawal(1990));

    }
}
