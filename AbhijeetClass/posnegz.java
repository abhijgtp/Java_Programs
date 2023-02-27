import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class posnegz
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter Number");
        a=sc.nextInt();
        if(a>0)
        {
            System.out.println("Number is positive");

        }
        else if(a<0)
        {
            System.out.println("Number is negative");
        }
        else 
        {
            System.out.println("Number is zero");
        }
    }
}