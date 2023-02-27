import java.util.Scanner;
class alphabet
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;char ch;
        System.out.println("Enter the character");
        ch=sc.next().charAt(0);
        a=ch;
        if(a>=65 && a<=90)
        {
            System.out.println("Character is Alphabet");
        }
        else if(a>=97 && a<=122)
        {
            System.out.println("Character is Alphabet");
        }
    }
}