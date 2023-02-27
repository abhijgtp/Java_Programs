import java.util.Scanner;
class triangle
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first angle of triangle");
        a=sc.nextInt();
        System.out.println("Enter second angle");
        b=sc.nextInt();
        System.out.println("Enter third Angle");
        c=sc.nextInt();
        if(a+b+c==180)
        {
            System.out.println("Triangle is valid");
        }
        else{
            System.out.println("Not Valid");
        }

    }
}
