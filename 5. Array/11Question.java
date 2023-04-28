//write a program in java to copy all elements of one array to another
//write a program to print the element of an array present on Reverse order
import java.lang.*;
import java.util.*;

class main
{
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        //Array Size
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();

        //Elements in Array
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter Elements: ");
            arr[i] = sc.nextInt();
        }

        //Copy array Elements
        int copy[] = new int[size];
        for(int i=0; i<size; i++)
        {
            copy[i] = arr[i];
        }

        System.out.println("\n---Output---\n");
        //printing copy array
        for(var x:copy){
            System.out.print(x+" ");
        }

        //reversing an array
        int reversearray[] = new int[size];
        for(int i=0; i<size; i++){
            reversearray[(size-1)-i] = arr[i];
        }

        System.out.println("\n\n---Reverse Array---\n");
        //print reversearray
        for(var x:reversearray){
            System.out.print(x+" ");
        }
    }
}