import java.util.Scanner;
public class Count{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,even=0,odd=0,zero=0,temp;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        temp=number;
        while (temp != 0) {
            int digit = temp % 10;
            if (digit == 0) {
                zero++;
            } else if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            temp /= 10;
        }
        System.out.println("Total number of even digits: " + even);
        System.out.println("Total number of odd digits: " + odd);
        System.out.println("Total number of zero digits: " + zero);
    }
}