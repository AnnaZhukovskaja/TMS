package Task1;

public class Main {

    //Создать класс, в котором будет статический метод.
    //Этот метод принимает на вход три параметра: Login, Password, confirmPassword.
    //Все поля имеют тип данных String.
    //Длина login должна быть меньше 20 символов и не должен содержать пробелы.
    //Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
    //Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
    //Также password и confirmPassword должны быть равны.
    //Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
    //WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
    // второй принимает сообщение исключения и передает его в конструктор класса Exception.
    //Метод возвращает true, если значения верны или false в другом случае.
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        try {
            System.out.println(LogInSystem.checkInput("2 2666hgj", "5rert e", "5rerte"));
        } catch (WrongLoginException e) {
            System.out.println("The login is incorrect.");
        } catch (WrongPasswordException e) {
            System.out.println("The password is incorrect.");
        }
    }
}
