import java.util.Scanner;
class sumdigit
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.println("Enter a three digit num");
        a=sc.nextInt();
        b=a/100;
        c=a%100;
        d=c/10;
        e=c%10;
        f=b+d+e;
        System.out.println(f);
        
    }
}
