import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        
        long sum = 0;
        
        //use split
        //String[] arr = input.split(" ");
        
        //for(String str : arr) {
        //	sum += Long.parseLong(str);
        //}
        //System.out.println(sum);
        
        //or 
        
        String buff = "";
        
        for(char c : input.toCharArray()){
            if(c != ' '){
            	buff += c;
            }else{
                sum += Long.parseLong(buff);
                buff = "";
            }
        }
        sum += Long.parseLong(buff);
        
        System.out.print(sum);
    }
}
