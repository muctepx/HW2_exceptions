import java.util.Scanner;

public class InputUtils {

    public static float getFloatInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            float result = 0;
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Введите дробное число: ");

                if (scanner.hasNextFloat()) {
                    result = scanner.nextFloat();
                    validInput = true;
                } else {
                    System.out.println("Ошибка: введено некорректное значение");
                    scanner.next();
                }
            }

            return result;
        }
    }

    public static String getStringInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            String result = "";
            try {
                System.out.print("Введите строку: ");
                String input = scanner.nextLine();
                result = input;

                if (input.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя");
                }

                System.out.println("Вы ввели: " + input);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

            return result;
        }
    }
}