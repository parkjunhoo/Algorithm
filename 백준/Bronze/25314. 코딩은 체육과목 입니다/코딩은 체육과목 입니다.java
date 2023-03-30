import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String text = "";
        
        while((num=num-4) >= 0){
            text += "long ";
        }
        text += "int";
        
        System.out.print(text);
    }
}