import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=s.nextInt();
        int Sum=0;
        for(int i=1;i<=n;i++)
        {
            Sum=Sum+i;
        }
        System.out.println("Sum = " + Sum);
        }
}

