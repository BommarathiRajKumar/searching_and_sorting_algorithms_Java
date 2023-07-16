//At worst case:-
//Time complexcity :- O(n logn);
//space compexcity :- O(1);

class Sort{
    static void quickSort(int arr[]){
        divide(arr,0,arr.length-1);
    }
    static void divide(int arr[], int start, int end){
        if(start<end){
            int pivoteIndex=partition(arr,start,end);
            divide(arr,start,pivoteIndex-1);
            divide(arr,pivoteIndex+1,end);
        }
    }
    static int partition(int arr[], int start, int end){
        int pivot=arr[end];
        int pi=start;
        for(int i=start; i<end; i++){
            if(arr[i]<=pivot){
                arr[i]=arr[pi]+arr[i]-(arr[pi]=arr[i]);
                pi++;
            }
        }
        arr[pi]=arr[end]+arr[pi]-(arr[end]=arr[pi]);
        return pi;
    }
}


//Driver code to check the quick sort.
class Main{
    public static void main(String args[]){
        int arr[]={1,200,5,3,55,100,1000,8,3,6};
        Sort.quickSort(arr);

        //After sorting
        for(int i:arr)System.out.print(i+", ");
    }
}
