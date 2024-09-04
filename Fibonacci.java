import java.util.Scanner;

public class Fibonacci {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        boolean isFibonacci = false;
        int i = 0;
        while (fibo(i) <= num) {
            if (fibo(i) == num) {
                isFibonacci = true;
                break;
            }
            i++;
        }

        if (isFibonacci) {
            System.out.println(num + " está na sequência de Fibonacci.");
        } else {
            System.out.println(num + " não está na sequência de Fibonacci.");
        }

        scanner.close();
    }
}
