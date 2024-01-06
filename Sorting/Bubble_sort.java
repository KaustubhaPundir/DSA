public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={3,5,1,6,3,9,111,49,999,444,8,1000,7};
        arr=bub_sort(arr);
        for (int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i]+",");
            }
        }
    }
    static int[] bub_sort(int[] arr){
        int temp=0;
        for(int i=arr.length-1;i!=0;i--){
            for (int j=1;j<=i;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
