/**
 * LeetCode Execution: TLE
 * 
 * Time Complexity: O(n^2),  n -> no of dict words
 * Space Complexity: O(n), Recursion Stack
 */


class Solution {
  private List<String> wordDict;
  
  public boolean wordBreak(String s, List<String> wordDict) {
      this.wordDict = wordDict;
      
      if (s.length() == 0 && wordDict.size() == 0) {
          return true;
      }
      
      return helper(s);
  }
  
  private boolean helper(String s) {
      boolean flag = false;
      
      for (String word : wordDict) {
          if (word.charAt(0) == s.charAt(0) && s.length() >= word.length()) {
              String temp = s.substring(0, word.length());
              if (temp.equals(word)) {
                  String nextWord = s.substring(word.length());
                  if(nextWord.length() > 0) {
                      flag = helper(nextWord);
                      if (flag) return true;
                  }
                  else
                      return true;
                  
              }
          }
      }
      
      return flag;
  }
}