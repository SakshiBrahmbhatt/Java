class Time 
{
    int hr,min,sec;
    int i,j;
    Time(int hr,int min,int sec)
    {
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
    static void sum(Time t1,Time t2)
    {
        int hrs=t1.hr+t2.hr;
        int mins=t1.min+t2.min;
        int secs=t1.sec+t2.sec;
        if(hrs>=24)
        {
            hrs-=24;
        }
        if(secs>=60)
        {
        mins+=1;
        secs-=60;
        }
        if(mins>=60)
        {
            hrs+=1;
            mins-=60;
        } 
        System.out.println(hrs+":"+mins+":"+secs);
    }
    public static void main(String args[])
    {
        Time a=new Time(2,30,4);
        Time b=new Time(22,29,56);
        sum(a,b);
    }
}