import java.util.Scanner;

public class LargeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("1st numbers: ");
        int a = sc.nextInt();
        System.out.print("2nd number: ");
        int b = sc.nextInt();
        System.out.print("3rd number: ");
        int c = sc.nextInt();
        
        if (a>=b && a>=c)
        System.out.print("A is largest " +a);
        else if (b>=a && b>=c)
        System.out.print("B is largest " +b);
        else 
        System.out.print("c is largest " +c);
    }
}