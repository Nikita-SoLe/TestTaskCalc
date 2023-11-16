import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            System.out.println(calc(str));
        }

    }

    public static String calc(String input) {
        String[] mas = input.split(" ");
        if (mas.length != 3) return Exception.except;

        int num1;
        if (isNumCorrect(mas[0])) num1 = Integer.parseInt(mas[0]);
        else return Exception.except;

        int num2;
        if (isNumCorrect(mas[2])) num2 = Integer.parseInt(mas[2]);
        else return Exception.except;

        char operator = mas[1].charAt(0);
        return _calc(num1, num2, operator);
    }

    static String _calc(int x, int y, char op) {
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
                return Exception.except;
            }
        }
    }

    static boolean isNumCorrect(String str) {
        try {
            int num = Integer.parseInt(str);
            return num <=10 && num > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

class Exception {
    static String except = "throws Exception";
}