import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        
        long sum = 0;
        
        String[] arr = input.split(" ");
        
        for(String str : arr) {
        	sum += Long.parseLong(str);
        }
        System.out.println(sum);
    }
}