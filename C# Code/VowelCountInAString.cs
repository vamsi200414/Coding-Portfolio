using System;
class Program{
    static void Main(string[] args){
        Console.Write("Enter a string : ");
        string s = Console.ReadLine();
        int count = 0;
        for(int i=0 ; i<s.Length ; i++){
            if(s[i]=='a' || s[i]=='e' || s[i]=='i'||s[i]=='o'|| s[i]=='u'){
                count++;
            }
        }
        Console.WriteLine(count);
    }
}
