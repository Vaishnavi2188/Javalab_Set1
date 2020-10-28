import java.util.*;
class Amstrong
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=s.nextInt();
        int i,a,r=1,sum=0;
        for(i=n;i>0;i=i/10)
        {
            a=i%10;
            r=a*a*a;
            sum=sum+r;
        }
        if(n==sum)
        {
            System.out.println(n + " is an Amstrong.");
        
        }
        else
        {
            System.out.println(n + " is not an Amstrong.");
        }
    }
}

