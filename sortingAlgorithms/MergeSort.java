//This merge sort algo works on the principle of divide and merge.
//WorstCase:-
//time complexicity:- O(nlogn);
//space complexicity:- O(n);

import java.util.ArrayList;
class Sort{

    public static void mergeSort(int arr[]){
        divide(arr, 0, arr.length-1);
    }
    
    private static void divide(int arr[], int low, int high){
        if(low>=high)return;
        int mid=(low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    private static void merge(int arr[], int low, int mid, int high){
        ArrayList<Integer> obj=new ArrayList<>();
        //low.....mid;
        //mid+1.....high;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                obj.add(arr[left]);
                left++;
            }else{
                obj.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            obj.add(arr[left]);
            left++;
        }
        while(right<=high){
            obj.add(arr[right]);
            right++;
        }
        for(int i=low; i<=high; i++){
            arr[i]=(int)obj.get(i-low);
        }
    }
}


//Driver code to check merge sort.
class Main{
    public static void main(String args[]){
        int[] arr={4,5,52,100,524,695,365,42,400,500,6,1,2,75,96,100000,25,3,5};
        Sort.mergeSort(arr);
        for(int i:arr)System.out.print(i+", ");
    }
}