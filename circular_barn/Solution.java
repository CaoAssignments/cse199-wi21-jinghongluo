import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String[] args) throws IOException {
		// initialize file I/O
		BufferedReader br = new BufferedReader(new FileReader("cbarn.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cbarn.out")));
		// read in N
		int n = Integer.parseInt(br.readLine());
		int[] cows = new int[n];
		// read in how many cows need to be in each room
		for(int i = 0; i < n; i++) {
			cows[i] = Integer.parseInt(br.readLine());
		}
        
        int minDis = Integer.MAX_VALUE;

		// try every possible room.
        for(int i = 0; i < n; i++){
            int curDis = 0;
            int counter = 1;

			// iterate through our cows arr in a circular fashion.
            for(int j =i+1; j % n != i; j++){
                curDis += cows[j%n] * counter;
                counter++; 
            }

			// compute the min every time.
            minDis = Math.min(minDis, curDis);
        }

    	pw.println(minDis);
		// close output stream
		pw.close();

    }
}