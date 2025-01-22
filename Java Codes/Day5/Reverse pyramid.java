import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        int s = abc.nextInt();
        for(int i=s ; i>=1 ; i--){
            for(int j=1 ; j<=i ; j++){
                if(j<=i){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
