import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String[] args) throws IOException {
		// initialize file I/O
		BufferedReader br = new BufferedReader(new FileReader("blink.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blink.out")));
		// read in N

        StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		long b = Long.parseLong(st.nextToken());

        int[] lightbulbs = new int[n];
        for(int i = 0; i < n; i++){
            lightbulbs[i] = Integer.parseInt(br.readLine());

        }

        for(int i = 0; i < b; i++){
            int[] newLightbulbs = new int[n];
            for(int j = 0; j < n; j++){
                if(j == 0 && lightbulbs[n-1] == 1){
                    newLightbulbs[j] = lightbulbs[j] == 1 ? 0 : 1;
                    continue;
                }
                if(j == 0){
                    newLightbulbs[j] = lightbulbs[j];
                    continue;
                }
                if(lightbulbs[j-1] == 1) newLightbulbs[j] = lightbulbs[j] == 1 ? 0 : 1;
                else newLightbulbs[j] = lightbulbs[j];
            }
            lightbulbs = newLightbulbs;

        }

        for(int i = 0; i < n; i++){
            pw.println(lightbulbs[i]);
        }
        
		// close output stream
		pw.close();
    }
}