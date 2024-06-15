import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,oN,sum=0;
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        oN = num;
        while (num > 0 || sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            sum += num % 10;
            num /= 10;
        }
        if (sum == 1) {
            System.out.println(oN + " is a Magic Number.");
        } else {
            System.out.println(oN + " is not a magic number ");
        }
    }
}
