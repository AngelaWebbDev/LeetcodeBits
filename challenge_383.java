/* DESCRIPTION:
* Given two strings ransomNote and magazine, 
* return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
* Each letter in magazine can only be used once in ransomNote.
 */

/* NOTES:
 * beats 100% for runtime (0ms)
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int counter=0;
        char[] charLetters = magazine.toCharArray();
        ArrayList<String> letters = new ArrayList<String>();
        for(int i=0;i<magazine.length();i++){
            letters.add(String.valueOf(charLetters[i]));
        }
        for(int i=0;i<ransomNote.length();i++){
            String ransomLetter = String.valueOf(ransomNote.charAt(i));
            for(int j=0;j<letters.size();j++){
                String zineLetter = letters.get(j);
                if(zineLetter.equals(ransomLetter)){
                    counter++;
                    letters.remove(j);
                    break;
                }
            }
        }
        if(counter==ransomNote.length()){
            return true;
        }else{
            return false;
        }
    }
}