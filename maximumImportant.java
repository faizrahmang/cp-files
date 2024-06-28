import java.util.*;

public class maximumImportant {
    class Solution {

        public static long maximumImportance(int n, int[][] roads) {
            int arr[] = new int[n];
            for (int[] i : roads) {
                arr[i[0]] += 1;
                arr[i[1]] += 1;
            }
            Arrays.sort(arr);

            long s = 1;
            long summ = 0;
            for (int i : arr) {
                summ += i * s;
                s++;
            }
            return summ;
        }

    }

}
