import java.util.*;


public class Solution{

    // using a set 
    public static int findPhotos(int N, int[] petals){
        int res = 0;
        

        // for every petal, compute the sum for all petals from that petal forward and use set to record every petal.
        for(int i = 0; i < N; i++){
            HashSet<Integer> set = new HashSet<>();
            int sum = 0;
            for(int j = i; j < N; j++){
                sum += petals[j];
                set.add(petals[j]);

                // if the sum is disviable and set does contains the average petal, increment res.
                if(sum % (j-i+1) == 0 && set.contains(sum / (j - i + 1))){
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){

        // Reading inputs from stdin
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String s = "";
        while(scanner.hasNext()){
            s += scanner.nextLine();
            if(!s.isEmpty()) break;
        }
        String[] inputStr = s.trim().split("\\s+");
        int[] petals = new int[inputStr.length];
        for(int i = 0; i < inputStr.length; i++){
            petals[i] = Integer.parseInt(inputStr[i]);
        }

        int photosSol = findPhotos(N, petals);
        System.out.println(photosSol);
        
    }
}
