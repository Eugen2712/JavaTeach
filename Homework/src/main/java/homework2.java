import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
//Дано произвольное число. Необходимо узнать, сколько в конце числа нулей.
        int number = 1002000;
        String numberStr = Integer.toString(number);
        int count = 0;
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            if (numberStr.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);

        //Необходимо найти интервал числа n (интервал это произведение всех целых чисел от 1 до n)
        int n = 5; // Example number n
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);

        //Пользователь вводит два числа. Необходимо найти среднее арифметическое между заданными числами (сумма чисел / количество чисел)
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();

        double mean = (num1 + num2) / 2;

        System.out.println("The arithmetic is: " + mean);


    }
}
