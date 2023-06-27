/*
 Time Complexcity:-
 Worst Case:- O(n^2)		
 Best Case:- O(n-1) == O(n).
*/
public class BubbleSort{
    public static void bubbleSort(int arr[]){
        int len = arr.length;
        for(int i=0; i<len-1; i++){
	        int flag=0;
	        for(int j=0; j<len-1-i; j++){
		        if(arr[j]>arr[j+1]){
                    flag=1;
		            arr[j]=arr[j]+arr[j+1]-(arr[j+1]=arr[j]);
		        }
	        }
	        if(flag==0) break;
        }
    }
    //Driver code to check
    public static void main(String arrgs[]){
        int arr[]={5,4,3,2,1};
        bubbleSort(arr);

        for(int i=0; i<arr.length; i++) System.out.print(arr[i]+", ");
    }
}
