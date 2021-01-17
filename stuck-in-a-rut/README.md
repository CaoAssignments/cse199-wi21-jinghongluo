## Problem: 
http://www.usaco.org/index.php?page=viewproblem2&cpid=1061

## Intuition:
We want find the two cows that will intersect and put their intersection time in a priority queue,
which will be sorted by the time of the slower cow. This way, we could determine whether that slower cow
would be stopped once we loop over all the intersection points. And we used sol to keep track of
the smallest step a particular cow would need to walk to come to a stop, aka a no-grass cell.

## Tags: 
Priority Queue, Sort, Math, Loop

## Run time:
O(N^2) where N is the number of cows given.
