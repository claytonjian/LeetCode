class Solution {
    public boolean isPalindrome(int x) {
        String text = "" + x;
        boolean answer = true;
        while(text.length() != 0){
            if(text.charAt(0) == text.charAt(text.length() - 1)){
                if(text.length() == 1){
                    text = "";
                }
                else{
                    text = text.substring(1, text.length() - 1);
                }
            }
            else{
                answer = false;
                break;
            }
        }
        return answer;
    }
}