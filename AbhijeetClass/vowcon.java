import java.util.Scanner;
class vowcon
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;char ch;
        System.out.println("Enter the alphabet");
        ch=sc.next().charAt(0);
        a=ch;
        if(a==97 ||a==65)
        {
            System.out.println("Vowels");
        }
        else if(a==101 || a==69)
        {
            System.out.println("Vowels");
        }
        else if(a==105 && a==73)
        {
            System.out.println("Vowels");
        }
        else if(a==111 || a==79)
        {
            System.out.println("vowels");
        }
        else if(a==117 || a==85)
        {
            System.out.println("Vowels");
        }
        else 
        {
            System.out.println("Consonants");
        }
    }
}