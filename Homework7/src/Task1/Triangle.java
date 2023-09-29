package Task1;

public class Triangle extends Shapes {

    int sideA;
    int sideB;
    int sideC;
    int height;

    public Triangle(int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    double area() {
        return (double) (sideC * height) / 2;
    }
}
