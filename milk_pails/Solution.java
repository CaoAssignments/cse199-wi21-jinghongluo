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
        int[] arr = new int[]{x, y};
        int[] dp = new int[m+1];
        Arrays.fill(dp, m + 1);
        dp[0] = 0;
        for(int i = 0; i <= m; i++){
            for(int j = 0; j < arr.length; j++){
                if(i < arr[j]) continue;
                dp[i] = Math.min(dp[i], 1 + dp[i-arr[j]]);
            }
        }
        int resIndex = m;
        for(int i = m; i >= 0; i--){
            if(dp[i] < m){
                resIndex = i;
                break;
            }
        }
        pw.println(resIndex);
		pw.close();
    }
}