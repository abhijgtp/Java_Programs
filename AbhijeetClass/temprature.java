import java.util.Scanner;
class temprature
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double c,f;
        System.out.println("Enter temprature in fahreinheit");
        f=sc.nextInt();
        c=(5.0/9.0)*(f-32);
        System.out.println(c);

    }
}
