
public class niceSubarray {
    public int numberOfSubarrays(int[] nums, int k) {
        int s = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] %= 2;
        }
        int preSum[] = new int[nums.length + 1];
        preSum[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            if (s >= k)
                ans += preSum[s - k];
            preSum[s]++;
        }
        return ans;

    }
}
