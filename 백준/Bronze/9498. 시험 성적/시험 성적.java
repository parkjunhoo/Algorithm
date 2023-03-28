import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        switch(score/10){
                
            case 10:
            case 9:
                System.out.print("A");
                break;
                
            case 8:
                System.out.print("B");
                break;
                
            case 7:
                System.out.print("C");
                break;
                
            case 6:
                System.out.print("D");
                break;
                
            default:
                System.out.print("F");
        }
    }
}