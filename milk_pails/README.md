## Problem:
http://www.usaco.org/index.php?page=viewproblem2&cpid=615

## Intuition:
The problem can be viewed as a divide and conquer problem where it requires some memorization of the previous values. We can use a bottom-up approach in solving the problem by asking ourselves what is the maximum amount of milk to add to size 0 pail if we are given two other pails, and work our way to to size m. 

## Tags: 
Array, I/O, Nested Loop, Divide and Conquer

## Run time: 
O(m), where m is the size of the pail.