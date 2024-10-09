class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class Calculator {
    // Метод для додавання
    public double add(double a, double b) {
        return a + b;
    }

    // Метод для віднімання
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод для множення
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод для ділення з обробкою ділення на нуль
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль недопустиме");
        }
        return a / b;
    }

    // Метод для квадратного кореня з перевіркою вхідних даних
    public double sqrt(double a) throws InvalidInputException {
        if (a < 0) {
            throw new InvalidInputException("Число не може бути від'ємним для операції квадратного кореня");
        }
        return Math.sqrt(a);
    }
}
