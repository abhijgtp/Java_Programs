import java.util.Scanner;
class eligibility
{   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter age");
        a=sc.nextInt();
        if(a>=18)
        {
            System.out.println("You are eligible for voting");
        }
        else
        {
            System.out.println("Not eligible");
        }
    }
}
