import java.util.*;



public class Solution{

    // Using sort
    public static void findABC(List<Integer> input, int[] sol){
        Collections.sort(input);
        sol[0] = input.get(0);
        sol[1] = input.get(1);
        sol[2] = input.get(input.size()-1) - sol[0] - sol[1];
    }

    public static void main(String [] args){

        // Reading in user's input from terminal / stdin
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();
        while(scanner.hasNext()){
            input.add(scanner.nextInt());
            if(input.size() == 7) break;
        }


        int[] sol = new int[3];

        
        findABC(input, sol);

        System.out.println(sol[0] + " " + sol[1] + " " + sol[2]);

    }
}
