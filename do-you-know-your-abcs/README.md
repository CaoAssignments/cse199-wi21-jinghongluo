## Problem:
http://www.usaco.org/index.php?page=viewproblem2&cpid=1059

## Intuition:
Since A, B, C are all positive integers (non-zero), so by contradiction we can show that A and B must be
the 2 smallest number in the input. 

Want to show A is the smallest: 
Assume there exists a number D <= A, then D must be the sum of either A and B, B and C, or C and A.
But since A, B, and C are all positive integers, there is no way that D can be the sum of these 3 combinations.
Therefore, A must be the smallest.

Want to show B is the next smallest: 
Assume there exists a number D such that A <= D <= B, then D must be the sum of either A and B, or A and C.
But we know that B itself is greater than or equal to D and C is greater than or equal to B, neither of these two sum
with A would result in something that's greater than D since A cannot be 0. Therefore, no number exists between A and B,
and so B must be the next smallest number.

Then it's clear that C must be the difference between the largest number and the two smallest numbers in the input.

## Tags: 
Array, Math, Sort.

## Run time: 
O(N*log(N)) where N is the number of elements in input list (problem fixed to be 7).