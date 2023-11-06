import java.util.Scanner;

public class NumerePrime {

    public static void main(String[] args) {
        Scanner numar= new Scanner(System.in);
        int nr= numar.nextInt();
        System.out.println("Introduceti numar"+nr);
        boolean isPrime = true;
        for (int i = 2; i < nr; i++) {
            if (nr % i == 0) {
                isPrime = false; // If a divisor is found, it's not prime
                break; // No need to continue checking
            }
        }

        if (isPrime) {
            System.out.println(nr + " este prim");
        } else {
            System.out.println(nr + " nu este prim");
        }
    }
}