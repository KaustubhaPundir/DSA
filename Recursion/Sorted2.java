public class Sorted2 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        System.out.println(sorted(arr));
    }
    static boolean sorted(int[] arr){
        return helper(arr,0);
    }
    static boolean helper(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && helper(arr,i+1);
    }
}
