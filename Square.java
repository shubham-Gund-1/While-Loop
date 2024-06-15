import java.util.Scanner;
public class Square{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,square;
        System.out.print("Enter a number :");
        n = input.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a greater than zero value.");
        } else {
         i = 1;
            System.out.println("Squares of numbers up to " + n + ":");
            while (i <= n) {
                square = i * i;
                System.out.println(i + " * " + i + " = " + square);
                i++;
            }
        }
    }
}
