import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,count=0,temp;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        temp = num;
        if (num == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
    }
}
