import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args){
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	try {
			int count = Integer.parseInt(br.readLine());
			for(int i =0; i<count; i++) {
				String[] arr = br.readLine().split(" ");
				System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    }
}