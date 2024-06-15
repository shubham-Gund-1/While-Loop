import java.util.Scanner;
public class SumUpToNNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i,sum=0;
        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers up to " + n + " is: " + sum);
    }
}
