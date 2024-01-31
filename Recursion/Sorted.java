public class Sorted {
    public static void main(String[] args){
        int[] arr={1,2,7,4,5,6};
        System.out.println(sorted(arr));
    }
    static boolean sorted(int[] arr){
        return helper(arr,0);
    }
    static boolean helper(int[] arr,int i){
        if(i== arr.length-1){
            return true;
        }
        if (arr[i]<arr[i+1]){
            return helper(arr,i+1);
        }
        else return false;
    }
}
