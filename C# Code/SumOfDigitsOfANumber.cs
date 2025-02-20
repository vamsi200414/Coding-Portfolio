using System;
class Program{
    static void Main(string[] args){
        Console.Write("Enter a number to find sum : ");
        int n = Convert.ToInt32(Console.ReadLine());
        int sum = 0;
        while(n != 0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        Console.WriteLine("Output is : " + sum);
    }
}
