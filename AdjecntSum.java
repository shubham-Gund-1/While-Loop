import java.util.*;
public class AdjecntSum{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,n1,sum=0,n2;
        System.out.println("Enter a number :");
        n=input.nextInt();
        while(n>10){
            n1=n%10;
            n=n/10;
            n2=n%10;
            sum=sum+(n1*n2);
        }
        System.out.println("The multiplication is :"+sum);
    }
}