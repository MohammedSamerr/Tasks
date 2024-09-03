import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        int[] array = {1,0,0,1,1,1,0,1,1,1,1,0,1,1,1,0};
        Solution obj = new Solution();
        System.out.println(obj.getLongestSeq(array));
    }
}




   /* public static void rotate(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int temp= 0 , n=nums.length;
        for(int i : nums)
            deque.add(i);
        for(int i=0; i<k; i++){
            temp = deque.removeLast();
            deque.addFirst(temp);
        }

        System.out.println(deque);
    }*/
 /*  public static int maxProfit(int[] prices) {
       int minVal = Arrays.stream(prices).min().orElseThrow();
       int n = prices.length;
       if(prices[n-1]==minVal)
           return 0;
       int index = -1;
       for (int i = 0; i < n; i++) {
           if (prices[i] == minVal) {
               index = i; // Update index if the target is found
               break; // Exit the loop once found
           }
       }

       int maxVal=0;


       for(int i =index+1; i<n;i++){
           if (prices[i]>=maxVal)
               maxVal=prices[i];
       }
       return maxVal-minVal;
   }*/

   /* public static void IFunc(int[]arr,int i, int n){
        int value =arr[i] , j=i ;
        while (j>0&& arr[j-1]>value){
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = value;
        if(i+1<=n){
            IFunc(arr,i+1,n);
        }
    }*/


