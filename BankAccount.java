import java.util.Scanner;
class BankAccount 
{
    String Depositor_name,Acc_type;
    int Acc_no,count=0;
    double Balance;
    Scanner sc=new Scanner(System.in);
    void createAcc()
    {
        System.out.print("Enter your name: ");
        Depositor_name=sc.next();
        System.out.print("Enter your Account type: ");
        Acc_type=sc.next();
        count++;
        Acc_no=count;
        System.out.print("Enter the balance: ");
        Balance=sc.nextDouble();
    }
    void Deposit()
    {
        double d;
        System.out.print("Enter the amount you want to deposit: ");
        d=sc.nextDouble();
        Balance+=d;
    }    
    void withdraw()
    {
        double r;
        System.out.print("/nEnter the amount you want to withdraw: ");
        r=sc.nextDouble();
        if(r<Balance)
        Balance-=r;  
        else 
        System.out.println("Insufficient Balance");
    }
    void BalanceInquiry()
    {
        System.out.println("***********************");
        System.out.println("Customer name: "+Depositor_name);
        System.out.println("Account type: "+Acc_type);
        System.out.println("Account no.: "+Acc_no);
        System.out.println("Balance: "+Balance);
        System.out.println("***********************");
    }
    public static void main(String args[])
    {
        BankAccount a=new BankAccount();
        a.createAcc();
        a.Deposit();
        a.withdraw();
        a.BalanceInquiry();
    }
}