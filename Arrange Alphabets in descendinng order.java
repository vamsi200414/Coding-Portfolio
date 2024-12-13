/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		String s = abc.nextLine();
		StringBuilder sb = new StringBuilder();
		boolean[] seen = new boolean[256];
		for(int i=0 ; i<s.length() ; i++){
		    char ch = s.charAt(i);
		    if(!seen[ch]){
		        seen[ch] = true;
		        sb.append(ch);

		    }
		}
		char[] c = sb.toString().toCharArray();
		for(int i=0 ; i<c.length-1 ; i++){
		    for(int  j=i+1 ; j<c.length ; j++){
		        if(c[i] < c[j]){
		            char temp = c[i];
		            c[i] = c[j];
		            c[j] = temp;
		        }
		    }
		}
		String result = new String(c);
		System.out.print(result);
	}
}