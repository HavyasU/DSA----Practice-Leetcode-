class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = -1;
        for(int user[] : accounts){
            int wealth = 0;
            for(int amnt : user){
                wealth+=amnt;
            }
            if(maxwealth < wealth) maxwealth = wealth;
        }
        return maxwealth;
    }
}