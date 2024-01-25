import java.util.Arrays;

//Bubble sorting example
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={-7,4,0,-32,41,12};
        bubble ( arr );
        System.out.println ( Arrays.toString (arr));

    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0;i< arr.length;i++){
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
//            if(swapped==false)
            if(!swapped)
                break;

        }

        /*
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i] == arr[i+1]){
                continue;
            }
            return arr[i];
        }
        return -1;
         */
    }
}
