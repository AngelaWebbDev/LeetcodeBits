/* DESCRIPTION:
 * Given an integer x, return true if x is a 
 * palindrome, and false otherwise.
 */

/* NOTES:
 * beats 71.87% for runtime (5ms)
 * beats 86.8% for memory (42.5mb)
 */

class Solution {
    public boolean isPalindrome(int x) {
        String intAsStr = Integer.toString(x);
        int xLength = intAsStr.length();
        for(int i=0;i<xLength;i++){
            if(intAsStr.charAt(i)!=intAsStr.charAt(xLength-1-i))
                return false;
        }
        return true;
    }
}
