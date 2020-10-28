import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=s.nextInt();
        int i;
        int first=0;
        int second=1;
        int third;
        for(i=0;i<n;i++)
        {
            System.out.println(first);
            third=second+first;
            first=second;
            second=third;
        }
  
    }
}

