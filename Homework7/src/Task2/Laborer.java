package Task2;

public class Laborer extends Employee implements Printable {

    int shift;

    public Laborer(String name, String surname, int age, int experience, int shift) {
        super(name, surname, age, experience);
        this.shift = shift;
    }

    @Override
    public void print() {
        System.out.println("Laborer: " + name + " " + surname);
    }
}
