import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,count=0,temp;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        temp = number;
        while (temp != 0) {
            temp=temp/10;
            count++;
        }
        System.out.println("Total number of digits:" + count);
    }
}