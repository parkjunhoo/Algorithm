using System;

namespace Beakjoon {
    class Program {
        static void Main() {
            string s = Console.ReadLine();
            string[] cs = s.Split();
            
            int a = int.Parse(cs[0]);
            int b = int.Parse(cs[1]);
            Console.WriteLine(a+b);
        }
    }
}