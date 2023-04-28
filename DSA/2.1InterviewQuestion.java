//Time Complexity: O(logN)     | Big O of LogN
//Space Complexity: O(1)       | Constant Space Complexity
import java.lang.*;
import java.util.*;

class BinarySearch
{
    //function creating for Binary Search
    public static int Binary(int arr[], int target)
    {
        int low = 0, high = arr.length-1,  result = 0;
        while(low<=high)
        {
            int mid = (low + high) / 2;
            if(arr[mid] == target)
            {
                result = mid;
                high = mid - 1;
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }else low =  mid + 1;
        }
        return result;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Array Size from User
    System.out.print("Enter Size of Array: ");
    int n = sc.nextInt();

    //Array Declaration
    int arr[] = new int[n];
    for(int i=0; i<arr.length; i++)
    {
        System.out.print("Enter Element [" + i + "] = ");
        arr[i] = sc.nextInt();
    }
    //Target Elemenmt
    System.out.print("Enter the Target Element: ");
    int target = sc.nextInt();

    //Binary Search
    int result = Binary(arr,target);
    System.out.println("Index no: " + result);

    }
}