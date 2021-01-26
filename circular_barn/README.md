## Problem:
http://www.usaco.org/index.php?page=viewproblem2&cpid=616

## Intuition:
This problem is essnetially asking you to find the minimum distance cows have to travel to get to all rooms so every room has appropriate number of cows. For simplicity, we need to try to enter the barn using every room and see which room would give the lowest distance traveled. The lowest distance travel then can be calculated by using Math module to loop over the array from index i+1, all the way to i-1, in a circular fashion if our current index is at i.

## Tags: 
Array, Nested Loop, Math Module. 

## Run time: 
O(n^2) where n is the number of rooms in the barn.