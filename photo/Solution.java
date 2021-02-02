import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String[] args) throws IOException {
		// initialize file I/O
		BufferedReader br = new BufferedReader(new FileReader("photo.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("photo.out")));
		// read in N

        StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

        int[] a = new int[1000];
        int[] b = new int[1000];
        for(int i = 0; i < k; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(str.nextToken());
            b[i] = Integer.parseInt(str.nextToken());
            if(a[i] > b[i]){
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
        }

        int left = 1;
        int right;
        int res = 0;

        // while left pointer isn't at the end
        while(left <= n){
            right = n;

            // find the right end of the current photo
            for(int i = 0; i < k; i++){

                // shrink the right end if we see two unfriendly cows
                if(left <= a[i] && right >= b[i]){
                    right=b[i] -1;
                }
            }

            // update res and left pointer
            res++;
            left = right + 1;
        }



        pw.println(res);
		// close output stream
		pw.close();
    }
}