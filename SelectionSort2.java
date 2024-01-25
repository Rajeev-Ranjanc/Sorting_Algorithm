import java.util.Arrays;

//selection sort by minimum elements
public class SelectionSort2 {
    public static void main(String[] args){
        int[] nums = {4,5,1,-7,2,3};
//        System.out.println (getminindex ( nums, 2 , nums.length ));
        applyselectionsort(nums);
        System.out.println ( Arrays.toString (nums));
    }
    public static void applyselectionsort(int[]  nums){
        for(int i=0;i<nums.length;i++){
//            int first = i;
            int minindex = getminindex(nums , i , nums.length-1);
            swap(nums , i , minindex);
        }

    }
    public static int getminindex(int[] nums ,int first ,int last){
       int minindex=first;
        for (int i = first; i < nums.length; i++) {
            if(nums[minindex]>nums[i]){
                minindex = i;
            }
        }
       return minindex;
    }
    public static void swap(int[] nums , int first , int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
