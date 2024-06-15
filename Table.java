import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,num;
        System.out.print("Enter a number : ");
        num = scanner.nextInt();
        i = 1;
        System.out.println("Multiplication Table of " + num + ":");
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }        
    }
}
