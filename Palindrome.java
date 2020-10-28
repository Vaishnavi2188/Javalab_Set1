import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=s.nextInt();
        int temp,rev=0,r;
        temp=n;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        if(rev==temp)
        {
            System.out.println(temp + " is a Palindrome.");
        }
        else
        {
            System.out.println(temp + " is not a Palindrome.");
        }
    }
}

