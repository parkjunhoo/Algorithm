import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception{
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        boolean con1 = year % 4 == 0;
        boolean con2 = year % 100 == 0;
        boolean con3 = year % 400 == 0;
    
        if(con1 && !con2 || con3){
            System.out.print("1");
        }else{
            System.out.print("0");
        } 
    }

}