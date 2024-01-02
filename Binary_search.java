import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be searched : ");
        int search= input.nextInt();
        int ret=bin_search(search,arr);
        if (ret!=-1){
            System.out.println(search+" is at "+(ret+1)+" position in the array");
        } else if (ret==-1) {
            System.out.println(search+" is not in array");
        }

    }
    static int bin_search(int search,int[] arr){
        int mid=0;
        int start=0;
        int end=arr.length-1;
        while(true){
            mid=start+(end-start)/2;
            if (search<arr[mid]){
                end=mid-1;
            } else if (search>arr[mid]){
                start=mid+1;
            } else if (search==arr[mid]) {
                return mid;
            }
            else{
                break;
            }
        }
        return -1;
    }
}
