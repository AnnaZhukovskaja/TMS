package Task1;

public class Rectangle extends Shapes {

    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double perimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    double area() {
        return sideA * sideB;
    }
}
