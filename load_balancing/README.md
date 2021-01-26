## Problem:
http://www.usaco.org/index.php?page=viewproblem2&cpid=617

## Intuition:
The problem wants us to find the maximum number of cows appearing in one of the four regions if we were to use some a and b to divide the farm into four resulting regions. The approach for this problem is to iterate all the cooridinates that the cows are in and find the worst region with the most cows by keeping track of cows that are within the four regions. 

## Tags: 
Array, I/O, Nested Loop

## Run time: 
O(n^3) where n is the number of cows in the farm.