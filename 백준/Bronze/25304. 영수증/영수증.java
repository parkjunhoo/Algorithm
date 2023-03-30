import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] ars)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int checkSum = Integer.parseInt(br.readLine());
        int itemCount = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i =0; i<itemCount; i++){
            String[] items = br.readLine().split(" ");
            int price = Integer.parseInt(items[0]);
            int amount = Integer.parseInt(items[1]);
            
            sum += price * amount;
        }
        
        if(checkSum == sum){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
        
    }
}