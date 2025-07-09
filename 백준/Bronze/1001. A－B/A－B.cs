using System;

namespace Backjoon {
    class Program {
        static void Main() {
            string input = Console.ReadLine();
            string[] split = input.Split();
            int a = int.Parse(split[0]);
            int b = int.Parse(split[1]);
            
            Console.WriteLine(a-b);
        }
    }
}