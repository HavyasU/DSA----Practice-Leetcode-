import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        long[] pref = new long[n + 1];
        for (int i = 0; i < n; i++)
            pref[i + 1] = pref[i] + a[i];
        Stack<Integer> st = new Stack<>();
        long ans = 0;
        for (int i = 0; i <= n; i++) {
            int val = i == n ? 0 : a[i];
            while (!st.isEmpty() && a[st.peek()] >= val) {
                int mid = st.pop();
                int left = st.isEmpty() ? 0 : st.peek() + 1;
                int right = i - 1;
                long sum = pref[right + 1] - pref[left];
                ans = Math.max(ans, sum * a[mid]);
            }
            st.push(i);
        }
        System.out.println(ans);
    }
}
