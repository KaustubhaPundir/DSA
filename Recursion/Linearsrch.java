public class Linearsrch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=7;
        System.out.println(linear(arr,target));
    }
    static int linear(int[] arr,int target){
        return helper(arr,target,0);
    }
    static int helper(int[] arr, int target,int index){
        if(index==arr.length-1 && arr[index]!=target){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return helper(arr,target,index+1);
    }

    //we use helper function because we cant tell the user to enter 0 as the argument for steps that will not be a good practice

}
