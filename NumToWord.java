import java.util.Scanner;
public class NumToWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String word = "";
        System.out.print("Enter a number : ");
        num = input.nextInt();
        while (num != 0) {
            switch (num) {
                case 1:
                    word = "one";
                    break;
                case 2:
                    word = "two";
                    break;
                case 3:
                    word = "three";
                    break;
                case 4:
                    word = "four";
                    break;
                case 5:
                    word = "five";
                    break;
                case 6:
                    word = "six";
                    break;
                case 7:
                    word = "seven";
                    break;
                case 8:
                    word = "eight";
                    break;
                case 9:
                    word = "nine";
                    break;
                default:
                    System.out.println("Number out of range...");
            }
            num = 0;
        }
        System.out.println("Number in words: " + word);
    }
}
