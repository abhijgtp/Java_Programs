import java.util.Scanner;
class evenodd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }

    }
}
