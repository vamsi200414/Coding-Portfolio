using System;
class main{
    static void Main(string[] args){
        Console.Write("Enter your number : ");
        int n = Convert.ToInt32(Console.ReadLine());
        if(n%2 == 0){
            Console.WriteLine("Even");
        }
        else{
            Console.WriteLine("odd");
        }
        
    }
}
