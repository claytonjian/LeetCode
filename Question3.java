class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, answer = 0;
        Set<Character> set = new HashSet<>();
        while(i < s.length() && j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                answer = Math.max(j - i, answer);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return answer;
    }
}