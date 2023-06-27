/*Time Complexcity:- 
  Best case:- O(1);
  Worst Case:- O(logN)

  Note:- BinarySearch only work on the sorted data.
*/
public class BinarySearch {
    public static void main(String arrgs[]){
        int arr[]={1,2,3,4,5};

        int start=0, end=arr.length-1, element=5;
        while(start<=end){
            int middle=(start+end)/2;
            if(arr[middle]==element){
                System.out.print("found:- "+arr[middle] +" at index of "+middle);
                break;
            }else if(arr[middle]>element){
                end=middle-1;
            }else if(arr[middle]<element){
                start=middle+1;
            }
        }
        if(start>end)System.out.print(element+" is Not found in the array");
    }
}
