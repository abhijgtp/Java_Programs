import java.util.Scanner;
class radius
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,cr,areac,circum;
        System.out.println("Enter the radius for area of circle");
        r=sc.nextInt();
        System.out.println("Enter radius for circumference");
        areac=3.14*r*r;
        circum=2*3.14*r;
        System.out.println("Area of circle is " + areac);
        System.out.println("Circumference of circle is "+ circum);
    }
}