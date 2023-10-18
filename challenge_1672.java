/*
 * Description:
 * You are given an m x n integer grid accounts where 
 * accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. 
 * Return the wealth that the richest customer has.
 */

/* NOTES:
 * beats 100% for runtime (0ms)
 */

class Solution {
    public int maximumWealth(int[][] accounts) {
    int richest = 0;
    int currNetWorth=0;
    for(int i=0;i<accounts.length;i++){
        currNetWorth=0;
        for(int j=0;j<accounts[i].length;j++)
            currNetWorth+=accounts[i][j];
        if(currNetWorth>richest)
                richest=currNetWorth;
    }
    return richest;
    }
}