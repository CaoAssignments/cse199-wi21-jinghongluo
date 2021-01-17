## Problem:
http://www.usaco.org/index.php?page=viewproblem2&cpid=1060

## Intuition:
loop over every petal and the petals right after it to compute the average flower, then and use a set or a boolean array to keep track of the visited petal.


## Tags: 
set/boolean array, Array, for loop.

## Run time:
O(N^2) where N is the length of the petal list.
