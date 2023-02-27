import java.util.Scanner;
class rectangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,b,area,perimeter;
        System.out.println("Enter the length");
        l=sc.nextInt();
        System.out.println("Enter the breadth");
        b=sc.nextInt();
        area=l*b;
        perimeter=2*(l+b);
        System.out.println("Area of rectangle is " + area);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}