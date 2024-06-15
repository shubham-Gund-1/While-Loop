import java.util.Scanner;
public class PrimeCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,count=0,temp,digit;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            digit = temp % 10;
            boolean isPrime = true;
            if (digit <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i < digit; i++) {
                    if (digit % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                count++;
            }
            temp = temp / 10;
        }
        System.out.println("Number of prime digits: " + count);
    }
}
