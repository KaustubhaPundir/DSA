public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3,9,7};
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;

            int max=max_inarr(arr,last);
            swap(last,max,arr);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int last,int max,int[] arr){
        int temp=arr[last];
        arr[last]=arr[max];
        arr[max]=temp;
    }
    static int max_inarr(int[] arr,int last){
        int max=0;
        for(int j=0;j<=last;j++) {
            if (arr[j] > arr[max]) {
                max = j;
            }
        }
        return max;
    }
}
//best case --> O(n^2)
//worst case --> O(n^2)
//stable --> No
