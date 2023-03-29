import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        
        String[] arr = br.readLine().split(" ");
        int now = Integer.parseInt(arr[0])*60 + Integer.parseInt(arr[1]);
        
        int cost = Integer.parseInt(br.readLine());
        
        int dest = now + cost;
        if(dest >= 60*24){
            dest = dest - 60*24;
        }
        System.out.print(dest/60+" "+dest%60);
    }
}