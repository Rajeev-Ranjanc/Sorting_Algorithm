//insertion sort
//hybrid sorting -> with the merge sort or quick sort
import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] nums = {5,3,4,1,2};
        int size =  nums.length;
        InsertionSort(nums , size);
        System.out.println ( Arrays.toString (nums));

    }
    public static void InsertionSort(int[] nums , int n ){
//        for (int i = 0; i <= n-2; i++) {
        //i will goes until n-2 bcz j is going till i+1
        //if i will till n-1 the j will go upto n which is array out of the bond
        for (int i = 0; i <= n-2; i++){

            for(int j=i+1;j>0;j--){

                if(nums[j] < nums[j-1]){

                    swap ( nums, j , j-1 );

                }
                else{

                    break;

                }
            }
        }
    }
    public static void swap(int[] nunms , int firstIndex , int SecondIndex){
        int temp = nunms[firstIndex];
        nunms[firstIndex] = nunms[SecondIndex];
        nunms[SecondIndex] = temp;
    }
}
