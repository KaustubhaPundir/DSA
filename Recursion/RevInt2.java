import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=input.nextInt();
        int digits=(int)Math.log10(num)+1;
        int ans=reverser(num,digits-1);
        System.out.println(digits);
        System.out.println("Reverse is "+ans);
    }
  static int reverser(int num, int digits){
        if(num==0){
            return 0;
        }
        int mul=(int)Math.pow(10,digits);
        return ((num%10)*mul)+reverser(num/10,digits-1);
    }
}
  
