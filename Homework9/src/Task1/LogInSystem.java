package Task1;


public class LogInSystem {

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


    public static boolean checkInput(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if ((login.contains(" ")) || (login.length() >= 20)) {
            throw new WrongLoginException("");
        } else if ((password.contains(" ")) || (password.length() >= 20) || (confirmPassword.length() != password.length()) || (!isHasDigits(password))) {
            throw new WrongPasswordException("");
        }
        return true;
    }

    static private boolean isHasDigits(String psw) {

        boolean hasDigits = false;
        for (int i = 0; i < psw.length() && !hasDigits; i++) {
            if (Character.isDigit(psw.charAt(i))) {
                hasDigits = true;
            }
        }
        return hasDigits;
    }
}
