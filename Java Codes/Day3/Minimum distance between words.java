import java.util.*;

public class Main
{
    public static void main(String[] args) {
        // Input string to analyze
        String s = "there is no time like today and we hope this is the first of many many many times comming here";
        
        // Words to search for
        String w1 = "many";
        String w2 = "the";
        
        // Split the input string into words
        String[] data = s.split(" ");
        
        // Lists to hold indices of words w1 and w2
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        // Iterate through the array of words to find positions of w1 and w2
        for(int i = 0; i < data.length; i++){
            String word = data[i];
            
            // If the word matches w1, add its index to l1
            if(word.equals(w1)){
                l1.add(i);
            }
            // If the word matches w2, add its index to l2
            else if(word.equals(w2)){
                l2.add(i);
            }
        }
        
        // If either of the lists is empty, print "1" indicating no valid distance found
        if(l1.isEmpty() || l2.isEmpty()){
            System.out.print("1");
        }
        else {
            // Initialize min to a very large value to find the minimum distance
            int min = Integer.MAX_VALUE;
            
            // Loop through all combinations of indices in l1 and l2 to find the minimum distance
            for(int i = 0; i < l1.size(); i++){
                for(int j = 0; j < l2.size(); j++){
                    // Calculate the absolute difference in positions
                    int dist = Math.abs(l1.get(i) - l2.get(j));
                    
                    // Update min if a smaller distance is found
                    min = Math.min(min , dist);
                }
            }
            
            // Output the minimum distance found
            System.out.print(min);
        }
    }
}
