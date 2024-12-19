/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String s = "there is no time like today and we hope this is the first of many many many times comming here";
		String w1 = "many";
		String w2 = "the";String[] data = s.split(" ");
		List<Integer> l1 = new ArrayList
		<>();
		List<Integer> l2 = new ArrayList<>();
		for(int i=0 ; i<data.length ; i++){
		    String word = data[i];
		    if(word.equals(w1)){
		        l1.add(i);
		    }
		    else if(word.equals(w2)){
		        l2.add(i);
		    }
		}
		if(l1.isEmpty() || l2.isEmpty()){
		    System.out.print("1");
		}
		else{
		    int min = Integer.MAX_VALUE;
		for(int i=0 ; i<l1.size() ; i++){
		    for(int j=0 ; j<l2.size() ; j++){
		        int dist = Math.abs(l1.get(i) - l2.get(j));
		        min = Math.min(min , dist);
		    }
		}
		System.out.print(min);
		}
		
	}
}
