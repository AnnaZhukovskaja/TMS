package Task1;

public class Main {

    //1. Написать иерархию классов «Фигуры».
    //Фигура -> Треугольник -> Прямоугольник -> Круг.
    //Реализовать ф-ю подсчета площади для каждого типа фигуры и
    //подсчет периметра. Создать массив из 5 фигур. Вывести на экран
    //сумму периметра всех фигур в массиве.
    public static void main(String[] args) {

        Shapes[] shapes = new Shapes[5];
        shapes[0] = new Circle(5.0);
        System.out.println("The area of the Circle 1 = " + shapes[0].area());

        shapes[1] = new Circle(8.0);
        System.out.println("The area of the Circle 2 = " + shapes[1].area());

        shapes[2] = new Rectangle(3, 5);
        System.out.println("The area of the Rectangle 1 = " + shapes[2].area());

        shapes[3] = new Rectangle(1, 3);
        System.out.println("The area of the Rectangle 2 = " + shapes[3].area());

        shapes[4] = new Triangle(3, 4, 5, 6);
        System.out.println("The area of the Triangle = " + shapes[3].area());

        System.out.println("Sum of the perimeters of all shapes =  " + (shapes[0].perimeter() + shapes[1].perimeter() + shapes[2].perimeter() + shapes[3].perimeter() + shapes[4].perimeter()));

    }
}
