import java.util.Scanner;
class salary
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary = sc.nextDouble();
        double da=0.2*salary;
        double hra=0.4*salary;
        double gross = salary+da+hra;
        System.out.println("da " + da);
        System.out.println("hra " + hra);
        System.out.println("gross " + gross);
    }
}
