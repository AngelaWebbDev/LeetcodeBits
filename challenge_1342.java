/*
 * DESCRIPTION:
 * Given an integer num, return the number of steps to reduce it to zero.
 * In one step, if the current number is even, you have to divide it by 2, 
 * otherwise, you have to subtract 1 from it.
 */

/* NOTES:
 * beats 82.42% for memory (38.9mb)
 */

class Solution {
    public int numberOfSteps(int num) {
        int counter = 0;

        while(num>0){
            if(num%2>0){
                num-=1;
                counter++;
            }else{
                num/=2;
                counter++;
            }
        }
        return counter;
    }
}