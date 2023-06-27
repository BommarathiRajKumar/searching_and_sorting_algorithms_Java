/*Complexity Analysis of Linear Search:
    Time Complexity:
    • Best Case: In the best case, the key might be present at the first index. 
        So the best case complexity is O(1).
    • Worst Case: In the worst case, the key might be present at the last index i.e.
        So the worst case complexity is O(N) where N is the size of the list.
    • Average Case: O(N)
    • Auxiliary Space: O(1) as except the variable to iterate through the list, no other variable is used.
*/
public class LinearSearch {
        public static int linearSearch(int arr[], int element){
        int len=arr.length;
        for(int i=0; i<len; i++){
            if(arr[i]==element)return i;
        }
        return -1;
    }
    
    //Drive method to check
    public static void main(String args[]){
        int array[]={1,2,3,4,5};
        int element=5;

        int result=linearSearch(array, element);

        if(result != -1){
            System.out.print(element+" is present at index of "+result);
        }else{
            System.out.print("Not present in array");
        }
    } 
}



//Recursive Code For Linear Search
/*import java.io.*;
public class LinearSearch {

	public static int linearSearch(int arr[], int size, int element) {
		if (size == 0) return -1;
		else if (arr[size-1] == element) return size-1;
		else return linearSearch(arr, size-1, element);
	}
	// Driver method to check
	public static void main(String[] args) {
        int arr[] = { 5, 15, 6, 9, 4 };
		int element = 4;
		int reult = linearSearch(arr, arr.length, element);

		if (reult != -1)
			System.out.println("The element " + element + " is found at "+ reult + " index of the given array.");
		else
			System.out.println("The element " + element + " is not found in the given array.");
	}
}
*/
