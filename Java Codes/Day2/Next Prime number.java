import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int n = abc.nextInt();
        n++;
        while(true){
            boolean prime = true;
            for(int i=2 ; i<n ; i++){
                if(n%i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime == true){
                System.out.print(n);
                break;
            }
            n++;
        }
    }
}
