import java.util.Scanner;

public class Main {

    public static int dividerAmount(int number) {
        int amount = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                amount += i;
            }
        }
        return amount;
    }

    public static void prim(int number) {
        if (dividerAmount(number) > 1) {
            System.out.println(number + " Is not a Prime number.");
        } else {
            System.out.println(number + " Is a Prime number.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We are looking for friendly numbers. Please provide two numbers, and we will check if they are friendly with each other.: ");
        System.out.print("Please provide a number.: ");
        int number1 = sc.nextInt();
        System.out.print("Please provide one more number.: ");
        int number2 = sc.nextInt();
        System.out.println();

        if (dividerAmount(number1) == number2 & dividerAmount(number2) == number1) {
            System.out.println("This is two number: " + number1 + ", " + number2 + " Freindly numbers.");
        } else {
            System.out.println("This is two number: " + number1 + ", " + number2 + " Not Frendly numbers.");
        }
        System.out.println();
        prim(number1);
        prim(number2);
    }
}