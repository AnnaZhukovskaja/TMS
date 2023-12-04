package Task2;

public class Accountant extends Employee implements Printable{

    int category;

    public Accountant(String name, String surname, int age, int experience, int category) {
        super(name, surname, age, experience);
        this.category = category;
    }

    @Override
    public void print() {
        System.out.println("Accountant: " + name + " " + surname);
    }
}
