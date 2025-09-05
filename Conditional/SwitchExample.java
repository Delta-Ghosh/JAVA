import java.util.Scanner;
public class SwitchExample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("For Hindi press 1\n for English press 2\n for Spanish press 3");
        int button = sc.nextInt();
        // if (button==1){
        // System.out.print("Namaste");
        // }else if (button==2){
        // System.out.print("Hello");
        // }else if (button==3){
        // System.out.print("Bonjure");
        // }else 
        // System.out.print("Invalid Choose");
        switch(button){
            case 1:
            System.out.print("Namaste");
            break;
            case 2:
            System.out.print("Hello");
            break;
            case 3:
            System.out.print("Bonjure");
            break;
            default:
            System.out.print("Invalid Choose");
        }
    }
}