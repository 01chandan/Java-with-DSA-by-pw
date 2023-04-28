// Bubble sort
import java.lang.*;
import java.util.*;

class main
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declare size of array
        System.out.print("Enter the Size of an Array: ");
        int size = sc.nextInt();

        //initialize an Array
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.print("Element ["+ (i+1) + "]: ");
            arr[i] = sc.nextInt();
        }
        
        //Bubble sort 
        for(int j=0; j<arr.length; j++){
            boolean swaped = false;
            for(int i=0; i<(arr.length-j-1); i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }

        //printing sorting array
        System.out.println("\nSorted Array are---\n");
        for(var a:arr)
        {
            System.out.print(a+ "  ");
        }
    }
}