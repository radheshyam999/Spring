import java.util.*;
public class Solution {

    static int max(int[] arr){
        int mI = arr.length -1,temp = 0,count = 0;
        for(int i = arr.length -2;  i >=0 ; i--){
            if(arr[mI] > arr[i]){
                return arr[i];

            }

            if(arr[mI] == arr[i]){
                //mI = i;
                count++;
            }


        }
        if(count == arr.length-1){
            return -2147483648;
        }
        temp = arr[mI];
        arr[mI] = -2147483648;


        return ((temp > arr[0]) ? temp : -2147483648);
    }

    public static int secondLargestElement(int[] arr) {
        int m = 0;
        if(arr.length<= 1) return -2147483648;
        Arrays.sort(arr);
        // int len  = arr.length;
        // if(arr[len -1]  != arr[len -2] )
        // 	return arr[len-2];
        for(int i = 0; i < 2; i++){
            m =   max(arr);
            if(m == -2147483648) return -2147483648;
        }
        return m;
    }

    public static void main(String[] args) {
//        int []arr = {1, 2, 3, 4};
//        rotate(arr, 2);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        System.out.println(removeConsecutiveDuplicates("aabccbaa"));
        ;





    }
    public static void rotate(int[] arr, int d) {
//        ArrayList<Integer> al  = new ArrayList<Integer>();
        int temp[] = new int[arr.length];
        int k = 0;
        for(int i = d; i < arr.length; i++){
            temp[k++] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            temp[k++] = arr[i];
            //System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
             arr[i] = temp[i];
        }

    }


    public static String removeConsecutiveDuplicates(String str){
        int len = str.length();
        StringBuilder sb  = new StringBuilder(str);
        for (int i = 0; i < len; i++) {
            int j = i+1;
            while(sb.charAt(i) == sb.charAt(j)) j++;
            sb.delete(i+1, j);
        }
        return sb.toString();
    }



}
