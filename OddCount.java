import java.util.Scanner;
public class OddCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count = 0, temp, digit;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            digit = temp % 10;
            if (digit % 2 != 0) {
                count++;
            }
            temp = temp / 10;
        }
        System.out.println("Number of even digits: " + count);
    }
}
