package Task1;

//Создайте класс Phone, который содержит переменные number, model и weight. Создайте три экземпляра этого класса.
// Выведите на консоль значения их  переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
// Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
// Вызвать эти методы для каждого из объектов.
//Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса -
// number, model и weight.
//Добавить конструктор, который принимает на вход два параметра для
//инициализации переменных класса - number, model.
//Добавить конструктор без параметров.
//Вызвать из конструктора с тремя параметрами конструктор с двумя.
//Добавьте перегруженный метод receiveCall, который принимает два
//параметра - имя звонящего и номер телефона звонящего. Вызвать этот
//метод.
//Создать метод sendMessage с аргументами переменной длины. Данный
//метод принимает на вход номера телефонов, которым будет отправлено
//сообщение. Метод выводит на консоль номера этих телефонов.
public class Phone {

    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name + " " + getNumber());
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + number);
    }

    void sendMessage(String... numbers) {

        for (String num : numbers) {
            System.out.println(num);
        }
    }
}
