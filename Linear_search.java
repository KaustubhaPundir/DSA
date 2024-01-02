import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be searched : ");
        int search= input.nextInt();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==search) {
                System.out.println(search + " is at " + (i + 1) + " position in the array");
                break;
            } else if (i==arr.length-1 && arr[i]!=search) {
                System.out.println(search+ " is not in the array");
            }
        }
    }
}
