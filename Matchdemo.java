import java.util.Scanner;
class Cricket
{
 String name;
 int age;
 Scanner sc = new Scanner(System.in);
 void display()
 {
     System.out.println("Players name is "+name);
     System.out.println("Player's age is "+age);
 }
 void setdata()
 {
    System.out.print("Enter Your name: ");
    name=sc.next();
    System.out.print("Enter your age: ");
    age=sc.nextInt();
 }
}
class Match extends Cricket
{
    Scanner ip =new Scanner(System.in);
    Cricket c=new Cricket();
    int no_of_test,no_of_odi;
    void setdata()
    {
        c.setdata();
        System.out.print("Enter the no. of test: ");
        no_of_test=ip.nextInt();
        System.out.print("Enter the no. of odi: ");
        no_of_odi=ip.nextInt();
        System.out.println("*******************************************");
    }
    void display()
    {
        System.out.println("*******************************************");
        c.display();
        System.out.println("Player's no. of test are "+no_of_test);
        System.out.println("Player's no. of odis "+no_of_odi);
        System.out.println("*******************************************");
    }
}
class Matchdemo 
{
    public static void main(String[] args)
    {
        int i;
        Match[] m1=new Match[5];
        for(i=0;i<5;i++)
        {
            m1[i]=new Match();
        }
        for(i=0;i<5;i++)
        {
            System.out.println("Set data of "+(i+1)+" player:");
            m1[i].setdata();
        }
        for(i=0;i<5;i++)
        {
            System.out.println("Displaying "+(i+1)+" player:");
            m1[i].display();
        }
    }     
}