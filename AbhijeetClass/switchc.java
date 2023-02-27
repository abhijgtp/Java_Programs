import java.util.Scanner;
public class switchc
{
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 2 or 3");
        x=sc.nextInt();
        switch(x)
        {
            case 1:
            System.out.println("One");
            case 2:
            System.out.println("Two");
            case 3:
            System.out.println('Three');
        }
    }
}