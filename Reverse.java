import java.util.*;
public class Reverse{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,n1,sum=0;
        System.out.println("Enter a number :");
        n=input.nextInt();
        while(n>0){
            n1=n%10;
            n=n/10;
            sum=(sum*10)+n1;
        }
        System.out.println(sum);
    }
}