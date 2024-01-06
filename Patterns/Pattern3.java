import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int n=input.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int sp=n-row;sp>0;sp--){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
