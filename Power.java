import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println(Math.pow(a, b));
    }

}
