import java.util.Scanner;

public class test1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num, a,b,c,d,e;
        System.out.println("Enter a 3 digit number");
        num = sc.nextInt();
        a= num/100;
        b=num%100;
        c=b/10;
        d=b%10;
        e=(a*a*a)+(c*c*c)+(d*d*d);
        if(e==num)
        {
            System.out.println("Number is armstrong number");

        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}