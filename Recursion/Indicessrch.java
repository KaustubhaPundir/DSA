import java.util.ArrayList;
public class Indicessrch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,6};
        int target=4;
        System.out.println(indices(arr,target));
    }
    static ArrayList<Integer>ans=new ArrayList<Integer>();
    static ArrayList indices(int[] arr, int target){
        return helper(arr,target,0);
    }
    static ArrayList helper(int[] arr, int target,int index){
        if(index==arr.length){
            return ans;
        }
        if(arr[index]==target){
            ans.add(index);
        }
        return helper(arr,target,index+1);
    }

}
