import java.util.*;

public class Solution{
    public static void computeGrass(int N, int[] xCord, int[] yCord, char[] direction, int[] sol){

        // 1. Find all intersection point between cow i and cow j for all N cows. 
        //    Construct intersection point such that (cow_i, cow_j, time_for_cow_i_to_arrive_to_intersection, time_for_cow_j_to_arrive_to_intersection)
        //    Always construct point such that cow_j arrives later than cow_i
        //    Use Priority queue to sort by time_for_cow_j_to_arrive_to_intersection in increasing order.
        PriorityQueue<int[]> pq = new PriorityQueue<>((ip1, ip2) -> ip1[3] - ip2[3]);
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                // if cow i and cow j are going in the same direction, then they will never intersect.
                if(direction[i] == direction[j]) continue;

                // want to fix one cow's direction, so we know the other's direction as well.
                int cow_i = i; 
                int cow_j = j;
                if(direction[i] != 'N'){
                    int temp = cow_j;
                    cow_j = cow_i;
                    cow_i = temp;
                }

                // now we fixed cow_i to be facing North, and so we know cow_j must faces East.
                
                // we want to check if they actually have an intersection point now.
                if(xCord[cow_i] > xCord[cow_j] && yCord[cow_i] < yCord[cow_j]){
                    int time_j = xCord[cow_i] - xCord[cow_j];
                    int time_i = yCord[cow_j] - yCord[cow_i];
                    if(time_j < time_i){
                        pq.add(new int[]{cow_j, cow_i, time_j, time_i});
                    } else if(time_i < time_j){
                        pq.add(new int[]{cow_i, cow_j, time_i, time_j});
                    }

                    // if time_i == time_j, meaining they will get to the spot at the same time, then they will continue moving foward => not intersection point.
                }

            }
        }
        
        while(!pq.isEmpty()){
            int[] ip = pq.poll();
            if(ip[2] < sol[ip[0]] && ip[3] < sol[ip[1]]){
                sol[ip[1]] = ip[3];
            }
            // ip[2] < sol[ip[0]] && 
        }
        
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] xCord = new int[N]; // distinct
        int[] yCord = new int[N]; // distinct
        char[] direction = new char[N]; // can only be 'N' or 'E'
        for (int i = 0; i < N; i++) {
            direction[i] = in.next().charAt(0);
            xCord[i] = in.nextInt();
            yCord[i] = in.nextInt();
        }

        int[] sol = new int[N];
        Arrays.fill(sol, Integer.MAX_VALUE);
        computeGrass(N, xCord, yCord, direction, sol);

        for(int i = 0; i < sol.length; i++){
            if(sol[i] == Integer.MAX_VALUE) {
                System.out.println("Infinity");
            } else {
                System.out.println(sol[i]);
            }
        }


    }
}