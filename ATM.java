import java.util.*;
public class ATM {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int cpin = 1711,A=0,ch,balance=20000;
        System.out.println("Enter a pin:");
        while (A<=3) {
            int pin = input.nextInt();
            A++;
            if (pin == cpin) {
                System.out.println("Enter Your Acccount Type :(1.Current\n2.saving)");
                int acType=input.nextInt();
                switch(acType){
                    case 1:
                        System.out.println("Enter your choice \n1.Show balance\n2.Withdrawal\n3.Deposit\n4.Change pin\n5.Interrest:");
                        ch=input.nextInt();
                        switch(ch){
                            case 1:
                                System.out.println(balance);
                                break;
                            case 2:
                                System.out.println("Enter amount you want to withdrwal:");
                                int WA=input.nextInt();
                                if(balance>WA){
                                    System.out.println("Widrwal successful..");
                                    int RM=balance-WA;
                                    System.out.println("Remaining amount is :"+RM);
                                }
                                else{
                                    System.out.println("Insufficient blance...");
                                }
                                break;
                            case 3:
                                System.out.println("Enter deposite amount:");
                                int DA=input.nextInt();
                                int TA=balance+DA;
                                System.out.println("Total Amount is :"+TA);
                                break;
                            case 4:
                                System.out.println("Enter Your pin:");
                                pin=input.nextInt();
                                if(cpin==pin){
                                    System.out.println("Enter new pin");
                                    int npin=input.nextInt();
                                    cpin=pin;
                                    System.out.println("Pin set successfully...");
                                }
                                else{
                                    System.out.println("Invalid pin.");
                                }
                                break;
                                case 5:
                                    int I=balance/100*2;
                                    System.out.println("Interest is :"+I);
                                    break;
                            default:
                                System.out.println("Enter valid choice.");
                        }
                        break;
                    case 2:
                        System.out.println("Enter your choice \n1.Show balance\n2.Withdrawal\n3.Deposit\n4.Change pin\n5.Interrest:");
                        ch=input.nextInt();
                        switch(ch){
                            case 1:
                                System.out.println(balance);
                                break;
                            case 2:
                                System.out.println("Enter amount you want to withdrwal:");
                                int WA=input.nextInt();
                                if(balance>WA){
                                    System.out.println("Widrwal successful..");
                                    int RM=balance-WA;
                                    System.out.println("Remaining amount is :"+RM);
                                }
                                else{
                                    System.out.println("Insufficient blance...");
                                }
                                break;
                            case 3:
                                System.out.println("Enter deposite amount:");
                                int DA=input.nextInt();
                                int TA=balance+DA;
                                System.out.println("Total Amount is :"+TA);
                                break;
                            case 4:
                                System.out.println("Enter Your pin:");
                                pin=input.nextInt();
                                if(cpin==pin){
                                    System.out.println("Enter new pin");
                                    int npin=input.nextInt();
                                    cpin=pin;
                                    System.out.println("Pin set successfully...");
                                }
                                else{
                                    System.out.println("Invalid pin.");
                                }
                                break;
                                case 5:
                                    int I=balance/100*4;
                                    System.out.println("Interest is :"+I);
                                    break;
                            default:
                                System.out.println("Enter valid choice.");
                        }
                        break;
                }
                break; 
            } else {
                if (A<3) {
                    System.out.println("Incorrect pin. Please try again.");
                } else {
                    System.out.println("Your card is blocked...");
                }
            }
        }
    }
}
