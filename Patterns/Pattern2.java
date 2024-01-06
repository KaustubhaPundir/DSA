import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int n= input.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            if(row<=(n/2)){
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }
            } else if (row>(n/2)) {
                for(int col=n-row;col>=1;col--){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
