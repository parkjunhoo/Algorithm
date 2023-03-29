class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] useables = {"aya", "ye", "woo", "ma"};
        for(String str : babbling){
            
            for(String useable : useables){
                if(str.contains(useable)){
                    str = str.replaceAll(useable,".");
                }
            }
            str = str.replaceAll("\\.","");
            if(str.equals("")) answer++;
        }
        return answer;
    }
}