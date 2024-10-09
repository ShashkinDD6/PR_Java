import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            // Введення двох чисел
            System.out.print("Введіть перше число: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Введіть друге число: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            // Введення операції
            System.out.print("Виберіть операцію (+, -, *, /, sqrt): ");
            String operation = scanner.nextLine();
            double result;

            switch (operation) {
                case "+":
                    result = calculator.add(num1, num2);
                    System.out.println("Результат: " + result);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    System.out.println("Результат: " + result);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    System.out.println("Результат: " + result);
                    break;
                case "/":
                    result = calculator.divide(num1, num2);
                    System.out.println("Результат: " + result);
                    break;
                case "sqrt":
                    result = calculator.sqrt(num1);
                    System.out.println("Квадратний корінь з " + num1 + ": " + result);
                    break;
                default:
                    System.out.println("Невідома операція.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Невірний формат числа. Будь ласка, введіть дійсне число.");
        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (InvalidInputException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Невідома помилка: " + e.getMessage());
        } finally {
            System.out.println("Завершення обробки запиту.");
            scanner.close();
        }
    }
}
