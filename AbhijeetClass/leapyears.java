import java.util.Scanner;
class leapyears
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the year");
        a=sc.nextInt();
        if(a%4==0)
        {
            System.out.println("Year is a leap year");
        }
        else
        {
            System.out.println("Year is not a leap year");
        }
    }
}
