package Task1;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(){}

    public WrongPasswordException(String msg) {
        super("The password is incorrect.");
    }
}
