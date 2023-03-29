import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int time = h*60 + m - 45;
        if(time < 0){
            time = 24*60 + time;
        }
        h = time/60;
        m = time%60;
        System.out.print(h+" "+m);
    }
}