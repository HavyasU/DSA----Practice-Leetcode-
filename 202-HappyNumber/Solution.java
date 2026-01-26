class Solution {
    public boolean isHappy(int n) {
        Set<Integer> map = new HashSet<>();
        if (n == 1)
            return true;
        while (n >= 0) {
            int num = n;
            int sum = 0;
            while (num != 0) {
                int d = num % 10;
                sum += Math.pow(d, 2);
                num = num / 10;
            }
            if (sum == 1) {
                return true;
            } else {
                if (map.contains(sum)) {
                    return false;
                }
                map.add(sum);
                n = sum;
            }
        }
        return false;
    }
}