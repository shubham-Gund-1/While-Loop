import java.util.*;
public class Decimal{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,n1,p=1,sum=0;
        System.out.println("Enter a number :");
        n=input.nextInt();
        while(n>0){
            n1=n%2;
            n=n/2;
            sum=sum+(n1*p);
            p=p*10;
        }
        System.out.println("Binary number is :"+sum);
    }
}