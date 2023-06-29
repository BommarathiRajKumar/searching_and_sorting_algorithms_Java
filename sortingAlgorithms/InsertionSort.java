/*
   Time Complexcity:-
   Worst Case:- O(n^2)
   Best Case:- O(n)
 */
public class  InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j-1]>arr[j]){
                    arr[j]=arr[j-1]+arr[j]-(arr[j-1]=arr[j]);
                }else{
                    break;
                }
            }
        }
    }

    //Driver code to check.
    public static void main(String arrgs[]){
        int arr[]={5,4,3,2,1};
        insertionSort(arr);
        for(int i:arr) System.out.print(i+", ");
    }
}

 