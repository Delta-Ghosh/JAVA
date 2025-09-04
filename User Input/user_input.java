import java.util.Scanner;
class user_input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Age:");
        int age = sc.nextInt();
        System.out.print("Hello " + name + ", you are " + age + " years old.");
    }
}