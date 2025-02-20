using System;
class Program{
    static void Main(string[] args){
        Console.Write("Enter a string to reverse : ");
        string s = Console.ReadLine();
        string empty = "";
        for(int i=s.Length-1 ; i>=0 ; i--){
            empty += s[i];
        }
        Console.WriteLine(empty);
    }
}
