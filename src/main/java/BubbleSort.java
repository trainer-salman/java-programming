import java.util.Arrays;
public class BubbleSort {
        public static void main(String[] args){

            int [] arr = { 12, 23, 56, -78, 389, 254, -1, 0, 31};

            for (int i = 0; i < arr.length; i++){
                for(int j = i+1; j < arr.length; j++){
                    int temp = arr[0];
                    if (arr[j]< arr[i]){
                        temp = arr[i];
                        arr[i] = arr [j];
                        arr[j] = temp;
                    }
                }
//            System.out.println(arr[i]);
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("second largest element number is  " + arr[7]);
            System.out.println("second smallest element number is  " + arr[1]);
        }
}


