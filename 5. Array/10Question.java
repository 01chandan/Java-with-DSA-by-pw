//duplicate element in Array
import java.lang.*;
import java.util.*;

class duplicate
{


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Declare size
    System.out.print("Enter Size of Array: ");
    int n = sc.nextInt();
    
    //Declare Array
    int arr[] = new int[n];
    for(int i=0; i<arr.length; i++)
    {
        arr[i] = sc.nextInt();
    }
        
    //Duplicate element Search
    for(int i=0; i<arr.length; i++)
    {
        for(int j=i+1; j<arr.length; j++)
        {
            if(arr[i] == arr[j]){
            
                System.out.println("Duplicate Value Found: " + arr[j]);
            }
        }
    }
    }
}
