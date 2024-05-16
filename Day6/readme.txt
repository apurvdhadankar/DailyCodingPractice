Day 6 of Arrays 
1. Find the number occurring odd number of times in an array
Given an array of positive integers. All numbers occur an even number of times except one number which occurs an odd number of times. 
Find the number in O(n) time & constant space.

Examples : 
Input : arr = {1, 2, 3, 2, 3, 1, 3}
Output : 3
Input : arr = {5, 7, 2, 7, 5, 2, 5}
Output : 5
--------------------------------------------------------------------------------------------------------------------------------------

2. Find minimum number of platforms required for railway station
Given the arrival and departure times of all trains that reach a railway station, the task is to find the 
minimum number of platforms required for the railway station so that no train waits. We are given two arrays that 
represent the arrival and departure times of trains that stop.

Examples: 
Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}, dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00} 
Output: 3 
Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)

Input: arr[] = {9:00, 9:40}, dep[] = {9:10, 12:00} 
Output: 1 
Explanation: Only one platform is needed. 
--------------------------------------------------------------------------------------------------------------------------------------

3. Find a Pair Whose Sum is Closest to zero in Array
Given an integer array of N elements. You need to find the maximum sum of two elements such that sum is closest to zero.
Note: In Case if we have two of more ways to form sum of two elements closest to zero return the maximum sum.

Example:
Input: N = 3, arr[] = {-8 -66 -60}
Output: -68
Explanation: Sum of two elements closest to zero is -68 using numbers -60 and -8.
Input: N = 6, arr[] = {-21 -67 -37 -18 4 -65}
Output: -14
Explanation: Sum of two elements closest to zero is -14 using numbers -18 and 4.
--------------------------------------------------------------------------------------------------------------------------------------

4. Given a sorted array and a number x, find the pair in array whose sum is closest to x
Given a sorted array and a number x, find a pair in an array whose sum is closest to x.

Examples:
Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54
Output: 22 and 30
Input: arr[] = {1, 3, 4, 7, 10}, x = 15
Output: 4 and 10
Naive Approach:- A simple solution is to consider every pair and keep track of the closest pair (the absolute difference between pair sum and x is minimum). 
Finally, print the closest pair. The time complexity of this solution is O(n2)
--------------------------------------------------------------------------------------------------------------------------------------

5. Find all pairs of elements from an array whose sum is equal to given number
Given an array of N integers, and an integer K, the task is to find the number of pairs of integers in the array whose sum is equal to K.

Examples:  
Input: arr[] = {1, 5, 7, -1}, K = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).
Input: arr[] = {1, 5, 7, -1, 5}, K = 6
Output:  3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).   
--------------------------------------------------------------------------------------------------------------------------------------

6. Print all pairs with given sum
Given an array of integers, and a number ‘sum’, print all unique pairs in the array whose sum is equal to ‘sum’.

Examples :
Input : arr[] = {1, 5, 7, -1, 5}, sum = 6
Output : (1, 5), (7, -1)
Input : arr[] = {2, 5, 17, -1} sum = 7
Output : (2, 5)
