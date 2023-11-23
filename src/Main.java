import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String str = scan.nextLine();
            System.out.println(calc(str));
        }

    }

    public static String calc(String input) throws IOException {
        String[] mas = input.split(" ");
        if (mas.length != 3) throw new IOException();

        int num1;
        if (isNumCorrect(mas[0])) num1 = Integer.parseInt(mas[0]);
        else throw new IOException();

        int num2;
        if (isNumCorrect(mas[2])) num2 = Integer.parseInt(mas[2]);
        else throw new IOException();

        char operator = mas[1].charAt(0);
        return _calc(num1, num2, operator);
    }

    static String _calc(int x, int y, char op) throws IOException {
        switch (op) {
            case '+' -> {
                return String.format("%d", x + y);
            }
            case '-' -> {
                return String.format("%d", x - y);
            }
            case '/' -> {
                return String.format("%d", x / y);
            }
            case '*' -> {
                return String.format("%d", x * y);
            }
            default -> {
                throw new IOException();
            }
        }
    }

    static boolean isNumCorrect(String str) {
        int num = Integer.parseInt(str);
        return num <= 10 && num > 0;
    }
}
