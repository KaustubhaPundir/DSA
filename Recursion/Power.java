import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Format : x^n");
        System.out.println("Enter x : ");
        int x=input.nextInt();
        System.out.println("Enter n : ");
        int n=input.nextInt();
        int result=power(x,n);
        System.out.println(x+"^"+n+" is "+result);
    }
    static int power(int x,int n){
        if (n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
}
