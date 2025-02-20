using System;
class program{
    static void Main(string[] args){
        Console.Write("Enter number A : ");
        int a = Convert.ToInt32(Console.ReadLine());
        Console.Write("Enter number B : ");
        int b = Convert.ToInt32(Console.ReadLine());
        
        a = a+b;
        b = a-b;
        a = a-b;
        Console.WriteLine("value of a : " + a + " and b : " + b);
        
    }
}
