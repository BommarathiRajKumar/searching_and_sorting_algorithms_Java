//This merge sort algo works on the principle of divide and merge.
//WorstCase:-
//time complexicity:- O(nlogn);
//space complexicity:- O(n);

import java.util.ArrayList;
class Sort{

    public static void mergeSort(int arr[]){
        divide(arr, 0, arr.length-1);
    }
    
    private static void divide(int arr[], int start, int end){
        if(start>=end)return;
        int mid=(start+end)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    private static void merge(int arr[], int start, int mid, int end){
        ArrayList<Integer> obj=new ArrayList<>();
        //first array = start-----mid;
        //second array = mid+1----end;
        int left=start;
        int right=mid+1;
        while(left<=mid && right<=end){
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
        while(right<=end){
            obj.add(arr[right]);
            right++;
        }
        for(int i=start; i<=end; i++){
            arr[i]=(int)obj.get(i-start);
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