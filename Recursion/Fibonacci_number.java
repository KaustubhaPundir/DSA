import java.util.Scanner;

public class Fibonacci_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the place at which you have to find fibonacci number : ");
        int n= input.nextInt();
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(fibo(n-1)+fibo(n-2));
    }
}
