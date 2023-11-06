import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner numar=new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int n= numar.nextInt();


        int a = 0, b = 1;

        System.out.print("Șirul Fibonacci până la " + n + ": ");

        while (a <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}