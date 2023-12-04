package Task2;

public class Director extends Employee implements Printable{

    String region;

    public Director(String name, String surname, int age, int experience, String region) {
        super(name, surname, age, experience);
        this.region = region;
    }

    @Override
    public void print() {
        System.out.println("Director: " + name + " " + surname);
    }
}
