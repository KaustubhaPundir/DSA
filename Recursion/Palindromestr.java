import java.util.Scanner;

public class Palindromestr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String x=input.nextLine();
        boolean result=palindrome(x,0,x.length()-1);
        System.out.println(result);
    }
    static boolean palindrome(String n,int l,int r){
        if (l>r && n.charAt(l)==n.charAt(r)){
            return true;
        }
        else if (l>r && n.charAt(l)!=n.charAt(r)){
            return false;
        }
        if(l==r){
            return true;
        }
        if (n.charAt(l)!=n.charAt(r)){
            return false;
        }
        return palindrome(n,l+1,r-1);

    }
}
