import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int s = abc.nextInt();
        for(int i=1 ; i<=s ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
}
