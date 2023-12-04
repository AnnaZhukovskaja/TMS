package Task1;

import java.util.ArrayList;

public class NewArrayList {

//    Представим, что в Java нет коллекции типа ArrayList.
//    Создать свой класс, симулирующий работу класса динамической коллекции - т.е. создать свою кастомную коллекцию.
//     В основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных классов(т.е. это generic).
//    Предусмотреть операции добавления элемента, удаления элемента, получение элемента по индексу, проверка есть ли элемент
//     в коллекции, метод очистки все коллекции.
//    Предусмотреть конструктор без параметров - создает массив размером по умолчанию.
//    Предусмотреть конструктор с задаваемым размером внутреннего массива.
//    Предусмотреть возможность автоматического расширения коллекции при добавлении элемента в том случае, когда коллекция
//     уже заполнена.


    String[] newArrayList;
    int countOfElements = 0;

    public NewArrayList() {
    }

    public NewArrayList(int size) {
        newArrayList = new String[size];
    }

    public void addElement(String element) {

        if (countOfElements < newArrayList.length) {
            newArrayList[countOfElements] = element;
            countOfElements++;
            for (String elem : newArrayList) {
                System.out.print(elem + " ");
            }
        } else {
            String[] arrayListEnlarged = new String[newArrayList.length + 1];
            System.arraycopy(newArrayList, 0, arrayListEnlarged, 0, newArrayList.length);
            arrayListEnlarged[newArrayList.length] = element;
            for (String elem : arrayListEnlarged) {
                System.out.print(elem + " ");
            }
        }
        System.out.println();
    }

    public void removeElement(String element) {
        for (int i = 0; i < newArrayList.length; i++) {
            if (newArrayList[i].equals(element)) {
                newArrayList[i] = "null";
            }
            System.out.print(newArrayList[i] + " ");
        }
        System.out.println();
    }

    public void getElement(int index) {
        if (index < newArrayList.length) {
            System.out.println(newArrayList[index]);
        } else {
            System.out.println("There is no element with such an index.");
        }
    }

    public boolean isContansElement(String element) {
        for (String s : newArrayList) {
            if (s.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clean() {
        newArrayList = null;
        System.out.println("Array cleaned! ");
    }
}

