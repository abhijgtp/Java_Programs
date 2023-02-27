import java.util.Scanner;
class reverse
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int num=sc.nextInt();
        int num1=num/100;
        int num2=(num/10)%10;
        int num3=num%10;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        int reverse=(num3*100)+(num2*10)+num1;
        System.out.println("reverse of " + num + "is " + reverse);
        
    }
}
