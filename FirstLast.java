import java.util.Scanner;
public class FirstLast{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,lastDigit,firstDigit,sum=0;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        lastDigit = num% 10;
        firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        sum = firstDigit + lastDigit;
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
        System.out.println("Sum of first and last digit: " + sum);
    }
}
