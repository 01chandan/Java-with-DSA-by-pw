//Time Complexity: O(log 2 N)     | Big O of n
//Space Complexity: O(1)          | Constant Space Complexity
import java.lang.*;
import java.util.*;

class BinarySearch
{
    //function creating for Binary Search
    public static int Binary(int arr[], int target){
    
    int low = 0, high = arr.length-1;
    
    while(low<=high){
    int mid = (low + high) / 2;

        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]<target){
            low = mid +1;
        }
        else if(arr[mid]>target){
            high = mid-1;
        }
    }
    return -1;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Initialize Size of an Array 
    System.out.print("Enter Size of Array");
    int n = sc.nextInt();
    
    //Initialize elements in Array
    int arr[] = new int[n];
    for(int i=0; i<arr.length; i++)
    {
        arr[i] = sc.nextInt();
    }
    //Target Element in Array
    System.out.println("Enter the Target ELement in Array");
    int target = sc.nextInt();

    //Binary Search
    int result = Binary(arr, target);
    if(result == -1)
    {
        System.out.println("Binary Search Not Found: ");
    } else System.out.println("Binary Search Found "  + result);
    
    }
}