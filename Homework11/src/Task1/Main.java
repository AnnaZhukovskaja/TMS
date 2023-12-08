package Task1;

public class Main {
//    Представим, что в Java нет коллекции типа ArrayList.
//    Создать свой класс, симулирующий работу класса динамической коллекции - т.е. создать свою кастомную коллекцию.
//     В основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных классов(т.е. это generic).
//    Предусмотреть операции добавления элемента, удаления элемента, получение элемента по индексу, проверка есть ли элемент
//     в коллекции, метод очистки все коллекции.
//    Предусмотреть конструктор без параметров - создает массив размером по умолчанию.
//    Предусмотреть конструктор с задаваемым размером внутреннего массива.
//    Предусмотреть возможность автоматического расширения коллекции при добавлении элемента в том случае, когда коллекция
//     уже заполнена.

    public static void main(String[] args) {

        NewArrayList newArrayList = new NewArrayList();
        newArrayList.addElement("One");
        newArrayList.addElement("Two");
        newArrayList.addElement("Three");
        newArrayList.addElement("Four");
        newArrayList.addElement("Fife");

        newArrayList.addElement("Six");

        newArrayList.removeElement("One");

        newArrayList.getElement(10);
        newArrayList.getElement(2);

        System.out.println(newArrayList.isContansElement("Ten"));
        System.out.println(newArrayList.isContansElement("Four"));

        newArrayList.clean();
        System.out.println();

        NewArrayList newArrayList2 = new NewArrayList(7);
        newArrayList2.addElement("One");
        newArrayList2.addElement("Two");
        newArrayList2.addElement("Three");
        newArrayList2.addElement("Four");
        newArrayList2.addElement("Fife");
        newArrayList2.addElement("Six");
        newArrayList2.addElement("Seven");

        newArrayList2.addElement("Eight");

        newArrayList2.removeElement("One");

        newArrayList2.getElement(10);
        newArrayList2.getElement(2);

        System.out.println(newArrayList2.isContansElement("Ten"));
        System.out.println(newArrayList2.isContansElement("Four"));

        newArrayList2.clean();

    }
}
