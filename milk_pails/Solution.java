import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("pails.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("pails.out")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// read X, Y, and M
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

        // create arr to put x and y
        int[] arr = new int[]{x, y};

        // create dp arr to keep track of the maximum amount of milk to add to size-i for i in [0, m]
        int[] dp = new int[m+1];

        // fill everything with m+1
        Arrays.fill(dp, m + 1);

        // the max amount of milk to fill size of 0 pail is 0.
        dp[0] = 0;

        // iterate over m and arr
        for(int i = 1; i <= m; i++){
            for(int j = 0; j < arr.length; j++){
                // if size is smaller than the current pail, continue
                if(i < arr[j]) continue;

                // we will take the min of whether or not we take the current pail,
                // if we decide to take current pail, it will be 1 + dp[i-arr[j]]
                // otherwise dp[i]
                dp[i] = Math.min(dp[i], 1 + dp[i-arr[j]]);
            }
        }

        // set resIndex to m    
        int resIndex = m;

        // iterate top-down to see if dp[i] is less than m, because we have previously fill dp with m+1
        for(int i = m; i >= 0; i--){
            if(dp[i] < m){
                resIndex = i;
                break;
            }
        }

        // print result
        pw.println(resIndex);
		pw.close();
    }
}