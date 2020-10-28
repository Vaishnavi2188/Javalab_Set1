import java.util.*;
class Factor
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=s.nextInt();
        int f;
        for(f=1;f<=n;f++)
        {
             if(n%f==0)
             {
                 System.out.println(f + " is a Factor of " + n);
             }
        }
    }
}

