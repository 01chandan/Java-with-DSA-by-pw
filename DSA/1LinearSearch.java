//Time Complexity: O(n)     | Big O of n
//Space Complexity: O(1)    | Constant Space Complexity
import java.lang.*;
import java.util.*;

class LinearSearch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Initialize size of array
        System.out.print("Enter Size of Array  ");
        int n = sc.nextInt();

        // initialize array 
        System.out.print("Enter the " + n + " Elements of Array");
        int arr[] = new int [n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        //Target Element
        System.out.print("Enter Target Element ");
        int x = sc.nextInt();

        //Linear Search
        int indx = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == x)
            {
                System.out.println("Target Element are Found");
                indx = i;
                break;
            }
        }
        if(indx == -1)
        {
            System.out.println("Target Element Not Found!");
        }else System.out.println("Index Number is: " + indx);
    }
}