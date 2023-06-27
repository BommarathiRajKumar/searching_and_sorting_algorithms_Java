public class LinearSearch {
    /*Complexity Analysis of Linear Search:
        Time Complexity:
        • Best Case: In the best case, the key might be present at the first index. 
          So the best case complexity is O(1).
        • Worst Case: In the worst case, the key might be present at the last index i.e.
          So the worst case complexity is O(N) where N is the size of the list.
        • Average Case: O(N)
        • Auxiliary Space: O(1) as except the variable to iterate through the list, no other variable is used.
    */

    public static int linearSearch(int arr[], int require){
        int len=arr.length;
        for(int i=0; i<len; i++){
            if(arr[i]==require)return i;
        }
        return -1;
    }

    //Drive code to check
    public static void main(String args[]){
        int array[]={1,2,3,4,5};
        int y=5;

        int result=linearSearch(array, y);

        if(result != -1){
            System.out.print(y+" is present at index of "+result);
        }else{
            System.out.print("Not present in array");
        }

        

    }
    
}
