public class Binarysrch {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int target=3;
        System.out.println(binary(arr,target));
    }
    static boolean binary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        return helper(arr,target,start,end);
    }
    static boolean helper(int[] arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if((arr[mid]==arr[arr.length-1] && arr[mid]!=target)||(arr[mid]==arr[0] && arr[mid]!=target)){
            return false;
        }
        if(arr[mid]==target){
            return true;
        }
        else if(arr[mid]>target){
            return helper(arr,target,start,mid-1);
        }
        else {
            return helper(arr,target,mid+1,end);
        }
    }
}
