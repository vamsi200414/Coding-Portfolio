Problem Statement:
  
  (Separate Elements Based on Indices)
  Write a program to read an array of integers from the user and rearrange its elements into a
  new list such that all elements at even indices appear first, followed by all elements at odd indices. 

Code : 
  
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = abc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = abc.nextInt();
        }
        System.out.print("array = [");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            if(i%2 == 0){
                al.add(arr[i]);
            }
        }
        for(int i=0 ; i<n ; i++){
            if(i%2 != 0){
                al.add(arr[i]);
            }
        }
        System.out.print(al);
    }
}
