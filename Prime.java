import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=s.nextInt();
        int i,prime=1;
        for(i=2;i<=(n-1);i++)
        {
            if(n%i==0)
            {  
                prime=0;
                break;
            }
        }
        if(prime==0)
        {
            System.out.println(n + "  is not a Prime Number.");
        }
        else
        {
            System.out.println(n + " is a Prime Number.");
        }
    }
}

