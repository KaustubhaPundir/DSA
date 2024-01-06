public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 3, 2, 6};
        cyclic(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
    static void cyclic(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct_index=arr[i]-1;
            if(arr[i]!=arr[correct_index]){
                swap(correct_index,i,arr);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int last,int max,int[] arr){
        int temp=arr[last];
        arr[last]=arr[max];
        arr[max]=temp;
    }
}
//when a question is given in a format of range 1 to N use cyclic sort
//best case --> 
//worst case --> O()
//stable --> yes
