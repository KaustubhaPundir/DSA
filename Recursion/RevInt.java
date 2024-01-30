import java.util.Scanner;
public class RevInt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=input.nextInt();
        reverser(num);
        System.out.println(sum);
    }
    static int sum=0;
    static void reverser(int num){
        if (num==0){
            return;
        }
        int rem=num%10;
        sum=sum*10+rem;
        reverser(num/10);
    }
}
