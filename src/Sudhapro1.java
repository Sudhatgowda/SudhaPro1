import java.util.Scanner;

public class Sudhapro1 {

    public static void main(String[] args) {
        int A1 = 20, B1 = 20, sum1, sum2, sum3, sum4;
        sum1 = A1 + B1;
        sum2 = A1 - B1;
        sum3 = A1 * B1;
        sum4 = A1 / B1;

        System.out.println("The result is " + sum1 + sum2 + sum3 + sum4);

        System.out.println("Result is Good");

        double num1, num2, num3 = 0;
        char oper;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        System.out.println("enter operator");
        oper = scan.next().charAt(0);
        switch (oper) {
            case '+':
                num3 = num1 + num2;
                System.out.println("Addition Result is " + num3);
                break;

            case '-':
                num3 = num1 - num2;
                System.out.println("Substraction Result is " + num3);
                break;

            case '*':
                num3 = num1 * num2;
                System.out.println("Addition Result is " + num3);
                break;

            case '/':
                num3 = num1 / num2;
                System.out.println("Addition Result is " + num3);
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}

