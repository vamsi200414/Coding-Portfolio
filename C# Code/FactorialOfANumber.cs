using System;
class Program{
    static void Main(string[] args){
        Console.WriteLine("Enter a number to factorial number : ");
        int n = Convert.ToInt32(Console.ReadLine());
        int fact = 1;
        for(int i=n ; i>=1 ; i--){
            fact = fact*i;
        }
        Console.WriteLine("The factorial of number " + n + " is " + fact);
    }
}
