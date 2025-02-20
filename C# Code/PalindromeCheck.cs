using System;
class Program{
    static void Main(string[] args){
        Console.Write("Enter a string : ");
        string s = Console.ReadLine();
        char[] c = s.ToCharArray();
        Array.Reverse(c);
        string reverse = new string(c);
        Console.WriteLine("Reversed string is " + reverse);
        
        if(reverse.Equals(s)){
            Console.WriteLine("Palindrome");
        }
        else{
            Console.WriteLine("Not a palindrome");
        }
    }
}
