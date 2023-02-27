import java.util.Scanner;

import javax.sound.midi.Soundbank;
class divisiblity
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a=sc.nextInt();
        if(a%5==0 && a%11==0)
        {
            System.out.println("Number is DiVISIBLE BY 5");
        }
        else
        {
            System.out.println("Number is not divisible");
        }


    }
}
