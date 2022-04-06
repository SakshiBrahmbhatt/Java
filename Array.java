import java.util.Scanner;
class Array
{
    int N=10;
    int data[];
    int i,j,k;
    Scanner input=new Scanner(System.in);
    Array()
    {
        data=new int[N];
        System.out.println("Enter 10 elements of array one by one");
        for(i=0;i<N;i++)
        {
            data[i]=input.nextInt();
        }
    }
    Array(int size)
    {
        data=new int[size];
        System.out.println("Enter  "+size+ " elements of array one by one");
        for(i=0;i<size;i++)
        {
            data[i]=input.nextInt();
        }
    }
    Array(int data[])
    {
        this.data=data;
    }
    void display()
        {
        
            for(i=0;i<N;i++)
            {
                System.out.print(data[i]+",");
            }
            System.out.println();
        }
        void Reverse_a_array()
        {
            System.out.println("\nReverse array:");
            for(i=N-1;i>=0;i--)
            System.out.print(data[i]+",");
        }
        int Maximum_of_array()
        {
            int max;
            max=data[0];
            for(i=0;i<N;i++)
            {
                if(max<data[i])
                max=data[i];
            }
            return max;
        }
        int Average_of_array()
        {
            int avg,sum=0;
            for(i=0;i<N;i++)
            {
                sum+=data[i];
            }
            avg=sum/N;
            return avg;
        }
        int Search(int no)
        {
            System.out.println("No. is at ");
            for(i=0;i<N;i++)
            {
                if(data[i]==no)
                {
                    System.out.print(i+1+",");
                }
            }
            return 0;
        }
        void Sorting()
        {
            System.out.println("\nArray after sorted:");
            for(i=0;i<N;i++)
            {
                for(j=i+1;j<N;j++)
                {
                    if(data[j]<data[i])
                    {
                    k=data[j];
                    data[j]=data[i];
                    data[i]=k;
                    }
                }
            }
            for(i=0;i<N;i++)
            {
                System.out.print(data[i]+",");
            }
        }
        public static void main(String[] args)
        {
            int m;
            int []a1={1,2,3,4,5,4,3,2,1,2};
            Array a=new Array();
            Array b=new Array(10);
            Array c=new Array(a1);
            a.display();
            b.display();
            c.display();
            a.Reverse_a_array();
            m=a.Maximum_of_array();
            System.out.println("\nMaximum no. is "+m);
            m=a.Average_of_array();
            System.out.println("Average of array is "+m);
            m=a.Search(3);
            a.Sorting();
           
        }
}