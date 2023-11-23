import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        System.out.println(calc(str));
    }

    public static int calc(String input) throws IOException {
        String[] mas = input.split(" ");

        if (mas.length != 3) throw new IOException();

        int num1 = isNumCorrect(mas[0]);
        int num2 = isNumCorrect(mas[2]);

        char operator = mas[1].charAt(0);

        return _calc(num1, num2, operator);
    }

    static int isNumCorrect(String str) throws IOException {
        int num = Integer.parseInt(str);
        if (num <= 10 && num > 0) {
            return num;
        }
        throw new IOException();
    }

    static int _calc(int x, int y, char op) throws IOException {

        switch (op) {
            case '+' -> {
                return x + y;
            }
            case '-' -> {
                return x - y;
            }
            case '/' -> {
                return x / y;
            }
            case '*' -> {
                return x * y;
            }
        }
        throw new IOException();
    }
}
