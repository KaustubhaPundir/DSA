import java.util.Scanner;

public class CountZeros.java {
    static int zero=0;
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        zeros(num);
        System.out.println(zero);
    }
    static void zeros(int num){
        if (num==0){
            return;
        }
        if(num%10==0){
            zero++;
        }
        zeros(num/10);
    }
}
