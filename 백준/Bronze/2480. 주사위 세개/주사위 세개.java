import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");

		int[] nums = { Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]) };

		int rewards = 0;

		if ((nums[0] == nums[1]) && (nums[0] == nums[2])) {
			rewards = 10000 + nums[0] * 1000;
		} else {
			int same = 0;
			for(int x = 0; x<3; x++) {
				if(same != 0) break;
				for(int y = x; y<3; y++) {
					if(x==y) continue;
					if(nums[x]==nums[y]) {
						same = nums[x];
						break;
					}
				}
			}
			
			if (same == 0) {
				int big = nums[0];
				for (int i = 1; i < 3; i++) {
					if (big < nums[i]) {
						big = nums[i];
					}
				}
				rewards = big * 100;
			} else {
				rewards = 1000 + same * 100;
			}
		}

		System.out.print(rewards);
	}
}
