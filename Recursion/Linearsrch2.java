public class Linearsrch2 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int target=9;
        System.out.println(linear(arr,target));
    }
    static boolean linear(int[] arr,int target){
        return helper(arr,target,0);
    }
    static boolean helper(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || helper(arr,target,index+1);
    }
}
