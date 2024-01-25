//Selection Sort

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,8,1,2,2,3,6};
//       selection ( arr );
        sortingalgo(arr);
        System.out.println (Arrays.toString ( arr ));
    }

    static void sortingalgo(int[] arr){
        for(int i=0;i< arr.length;i++){
            int last = arr.length-1-i;
            int maxindex =getMaxIndex(arr, last);
            swap(arr,maxindex,last);
        }

    }
    static int getMaxIndex(int[] arr , int last){
        int max=0;
        for (int i = 0; i <= last; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

//    static void selection(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int last= arr.length-i-1;
//            int maxindex = getMaxindex(arr,0,last);
//            swap(arr , maxindex , last);
//        }
//
//    }
//    static int getMaxindex(int[] arr , int start , int last){
//        int max=start;
//        for (int i = 0; i <= last; i++) {
//            if(arr[max]<arr[i]){
//                max=i;
//            }
//        }
//        return max;
//    }
//    static void swap(int[] arr , int first , int second){
//        int temp=arr[first];
//        arr[first]=arr[second];
//        arr[second]=temp;
//    }
}
