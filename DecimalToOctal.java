import java.util.*;
public class DecimalToOctal{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,n1,p=1,sum=0;
        System.out.println("Enter a number :");
        n=input.nextInt();
        while(n>0){
            n1=n%8;
            n=n/8;
            sum=sum+(n1*p);
            p=p*10;
        }
        System.out.println("Octal number is :"+sum);
    }
}