import java.util.Scanner;
public class Disarium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, originalNum, sum = 0, digitsCount = 0, temp, power = 1, digit;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        originalNum = num;
        temp = num;
        while (temp != 0) {
            temp /= 10;
            digitsCount++;
        }
        temp = num;
        while (temp != 0) {
            digit = temp % 10;
            power = 1;
            for (int i = 1; i <= digitsCount; i++) {
                power =power*digit;
            }
            sum =sum+power;
            digitsCount--;
            temp /= 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is a Disarium number.");
        } else {
            System.out.println(originalNum + " is not a Disarium number.");
        }
    }
}
