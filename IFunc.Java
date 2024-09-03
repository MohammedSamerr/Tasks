public static void IFunc(int[]arr,int i, int n){
        int value =arr[i] , j=i ;
        while (j>0&& arr[j-1]>value){
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = value;
        if(i+1<=n){
            IFunc(arr,i+1,n);
        }
    }