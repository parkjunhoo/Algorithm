class Solution {
    public int solution(int[] num_list) {
        String hol = "";
        String jjak = "";
        
        for(int n : num_list) {
            if(n % 2 == 0) {
                jjak += Integer.toString(n);
            }else {
                hol += Integer.toString(n);
            }
        }
        
        
        
        return Integer.parseInt(hol) + Integer.parseInt(jjak);
    }
}