import java.util.*;
public class Palidrome{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,n1,n,temp=1,sum=0;
        System.out.println("Enter a number :");
        n=input.nextInt();
        temp=n;
        while(n>0){
            n1=n%10;
            n=n/10;
            sum=(sum*10)+n1;
        }
        if(temp==sum){
            System.out.println("Palidrome");
        }
        else System.out.println("Not palidrome");
    }
}