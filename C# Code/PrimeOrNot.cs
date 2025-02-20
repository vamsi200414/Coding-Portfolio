using System;
class Program{
    static void Main(string[] args){
        Console.WriteLine("Enter a number to check prime or not : ");
        int n = Convert.ToInt32(Console.ReadLine());
        int count = 0;
        for(int i=2 ; i<n ; i++){
            if(n%i == 0){
                count++;
                break;
            }
        }
        
        if(count == 0){
            Console.WriteLine("Prime number");
        }
        else{
            Console.WriteLine("Not a prime number");
        }
    }
}
