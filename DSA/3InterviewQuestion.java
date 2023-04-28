//Interview Problem (Square Root)
//Time Complexity 
import java.lang.*;
import java.util.*;

class Squareroot
{
    public static int squareroot(int num){
        int low=0, high=num, result = 0;
        while(low<=high){
        int mid = (low + high) / 2;
        int val = mid * mid;
        if(val == num)
        {
            return mid;
        } 
        else if(val < num){
            result = mid;
            low = mid + 1;
        } else high = mid -1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter Target Element
        System.out.print("Enter the number for finding Square Root: ");
        int num = sc.nextInt();

        //Function call 
        int result = squareroot(num);
        System.out.println("\n---Output---\n");
        System.out.println("Square Root is: " + result);
    } 
}