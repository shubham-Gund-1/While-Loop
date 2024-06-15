import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n,first=0,second=1,count=0,next;
        n = input.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
        } else {
            System.out.println("First " + n + " Fibonacci numbers:");
            while (count < n) {
                System.out.print(first + " ");
                next = first + second;
                first = second;
                second = next;
                count++;
            }
            System.out.println();
        }
    }
}
