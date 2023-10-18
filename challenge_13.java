/* DESCRIPTION:
 * Given a roman numeral, convert it to an integer.
 */

/* NOTES:
 * solution beats 100% for runtime (2ms)
 */

class Solution {
    public int romanToInt(String s) {
        char previousNumeral = 'P';
        char nextChar = 'P';
        int conversion = 0;
        char currentNumeral;
        for(var i=0;i<s.length();i++){
            currentNumeral = s.charAt(i);
            switch(currentNumeral){
                case('I'):
                    conversion+=1;
                    break;
                case('V'):
                    if(previousNumeral=='I')
                        conversion+=3;
                    else
                        conversion+=5;
                    break;
                case('X'):
                    if(previousNumeral=='I')
                        conversion+=8;
                    else
                        conversion+=10;
                    break;
                case('L'):
                    if(previousNumeral=='X')
                        conversion+=30;
                    else
                        conversion+=50;
                    break;
                case('C'):
                    if(previousNumeral=='X')
                        conversion+=80;
                    else
                        conversion+=100;
                    break;
                case('D'):
                    if(previousNumeral=='C')
                        conversion+=300;
                    else
                        conversion+=500;
                    break;
                case('M'):
                    if(previousNumeral=='C')
                        conversion+=800;
                    else
                        conversion+=1000;
                    break;
            }
            previousNumeral = currentNumeral;
        }
        return conversion;
    }
}