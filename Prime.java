import java.util.Scanner;
public class Prime 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(num<=1)
        {
            System.out.println("it is not prime");
            return;
        }
            boolean flag=false;
            for(int i=2;i<=num/2;i++)
            {
                if(num%i!=0)
                {
                    flag=true;
                    break;
                }
            }
            if(flag==true)
            {
                System.out.println("it is a not prime");
            }
            else 
            {
                System.out.println("it is a prime");
            }   
    }
    
}
