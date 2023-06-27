package Algorithms.sortingAlgorithms;

/*
 Time Complexcity:-
	Worst Case:- O(n^2)
	Best Case:- O(n^2)
 */
 public class SelectionSort{
    public static void selectionSort(int arr[]){
        int len=arr.length;
        for(int i=0; i<len-1; i++){
	        int maxElementIndex=0;
	        int last=len-i-1;
	        for(int j=0; j<=last; j++){
		        if(arr[j]>arr[maxElementIndex]) maxElementIndex=j;
	        }
	        arr[maxElementIndex]=arr[maxElementIndex]+arr[last]-(arr[last]=arr[maxElementIndex]);
        }
    }
    public static void main(String arrgs[]){
        int arr[] ={5,4,3,2,1};
        selectionSort(arr);
        for(int i:arr)System.out.print(i+", ");

    }
 }