package Task1;

public class WrongLoginException extends Exception{

    public WrongLoginException() {
    }

    public WrongLoginException(String msq) {
        super("The login is incorrect.");
    }
}
