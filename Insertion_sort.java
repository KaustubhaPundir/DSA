public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 13, 3, 9, 7};
        insertion(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
    static void insertion(int[] arr){
        for (int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(j-1,j,arr);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int last,int max,int[] arr){
        int temp=arr[last];
        arr[last]=arr[max];
        arr[max]=temp;
    }
}
//best case --> n
//worst case --> O(n^2)
//stable --> yes
//swaps are reduced as compared to bubble sort
