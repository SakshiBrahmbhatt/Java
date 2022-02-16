import java.util.Scanner;
class Calculator
{
    public static void main(String[] args)
    {
        int a,b,operator;
        Scanner input = new Scanner(System.in);
        System.out.println("Select an operator as per given no.:\n1.+\n2.-\n3.*\n4./");
        operator=input.nextInt();
        System.out.print("Enter first no.: ");
        a=input.nextInt();
        System.out.print("Enter second no.: ");
        b=input.nextInt();
        switch(operator)
        {
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            default:
            System.out.println("Select proper operator");
        }
    }
}