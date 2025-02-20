using System;
class Program{
    static void Main(string[] args){
        Console.WriteLine("Write fibonacci series");
        int n = Convert.ToInt32(Console.ReadLine());
        int a = 0;
        int b = 1;
        int c = a+b;
        Console.Write(a+ " " + b + " ");
        while(c <= n){
            Console.Write(c + " ");
            
            a=b;
            b=c;
            c=a+b;
        }
    }
}
