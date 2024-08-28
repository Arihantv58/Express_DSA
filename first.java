import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ener first number that you want to add : ");
            a=sc.nextInt();
            System.out.println("Enter second number that you want to add : ");
            b=sc.nextInt();
        }
        int c= a+b;
        System.out.println("Hello Thundergod! here is your required result : ");
        System.out.println(c);
    }
}
