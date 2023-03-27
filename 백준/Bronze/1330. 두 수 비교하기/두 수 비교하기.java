import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] arr = input.split(" ");
        
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        
        if(a > b){
            System.out.print('>');
        }else if(a < b){
            System.out.print('<');
        }else if(a == b){
            System.out.print("==");
        }
    }
}