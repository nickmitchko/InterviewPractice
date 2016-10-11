# Sorting

### Linear Time Sorting 

These algorithms assume something about the data there is to sort. (not universally fast)

1. Radix Sort: Sorts numbers by sorting them by digit, starts with the least significant digit
2. Counting Sort: Assumes each element x_i ∈ {0,...,k} where k is given to the algorithm.
3. Bucket Sort: Assumes the input is drawn from a normal distribution.

### Algorithm Analysis

|Algorithm   |Stable?   |In Place?   |Running Time O() | Extra Space  |Misc.   |
|---|---|---|---|---|---|
|Selection Sort         |  no | yes  | N²           | 1     |   |
|Insertion Sort         | yes | yes  | N ⇆ N²       | 1     | Order Dependent  |
|Shell Sort             | no  | yes  | N log(N)     | 1     |  |
|Quick Sort             |  no | yes  | N log(N)     | lg(N) | Probabilistic Guarantee  |
|3-partition Quick Sort | no  | yes  | N ⇆ N log(N) | lg(N) | Probabilistic Guarantee  |
|Merge Sort             | yes | no   | N log(N)     | N     |   |
|Heap Sort              | no  | yes  | N log(N)     | 1     |   |
|Counting Sort          | yes | yes  | N            | N     | Assumes unsorted values fall in range {0, k}. Algorithm takes k as a parameter  |
|Radix Sort             | yes | yes  | N            | Varies| Sorts numbers by each digit. Card Sorting Machines|
|Bucket Sort            | yes | yes  | N            | N     | Assumes input array is drawn from a uniform distribution (gaussian, etc..)|