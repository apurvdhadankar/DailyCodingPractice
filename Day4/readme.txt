
1. Find common elements in three sorted arrays
### Input:
Three sorted arrays of integers, let's call them `arr1`, `arr2`, and `arr3`.

### Output:
An array containing the common elements present in all three arrays. If there are no common elements, return an empty array.

### Example:
```
Input:
arr1 = [1, 3, 4, 6, 7, 9]
arr2 = [1, 2, 4, 5, 9, 10]
arr3 = [1, 4, 9, 11, 12]

Output:
[1, 4, 9]

Explanation:
1, 4, and 9 are the common elements present in all three arrays.
-------------------------------------------------------------------------------------
2. Subarrays with equal 1s and 0s
Input:
An array of integers containing only 0s and 1s.

Output:
An integer representing the count of subarrays where the number of 0s is equal to the number of 1s.

Example:
vbnet
Copy code
Input:
[0, 1, 0, 1, 0]

Output:
4

Explanation:
There are four subarrays with an equal number of 0s and 1s: [0, 1], [1, 0], [0, 1], [1, 0].
-------------------------------------------------------------------------------------
3. Rearrange the array in alternating positive and negative items

Given an array having positive and negative numbers, our task is to arrange them in an alternate fashion such that every positive number
is followed by a negative number and vice-versa maintaining the order of appearance. The number of positive and negative numbers need 
not to be equal. If there are more positive numbers then they have to appear at the end of the array , 
same condition for negative numbers also .

Input:  arr[] = {1, 2, 3, -4, -1, 4}
Output: arr[] = {-4, 1, -1, 2, 3, 4}

Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}


Input:
An array of integers.

Output:
The same array with positive and negative numbers arranged alternately.

Example:
Input:
[1, -3, 5, 6, -7, 9, -10, -19, 20]

Output:
[-3, 1, -7, 5, -10, 6, -19, 9, 20]

Explanation:
Positive and negative numbers are arranged alternately while maintaining their relative order within the array.
---------------------------------------------------------------------------------------------------
4. Find if there is any subarray with a sum equal to zero
Input:
An array of integers.

Output:
A boolean value indicating whether there exists a subarray with a sum equal to zero.

Example:
vbnet
Copy code
Input:
[4, 2, -3, 1, 6]

Output:
true

Explanation:
The subarray [2, -3, 1] has a sum equal to zero.
---------------------------------------------------------------------------------------------------
5. Find the missing integer	
Input:
An array of integers containing distinct numbers from 1 to n except for one missing number.

Output:
The missing integer.

Example:
vbnet
Copy code
Input:
[3, 7, 1, 2, 8, 4, 5]

Output:
6

Explanation:
The array contains numbers from 1 to 8, except for the missing number 6.
---------------------------------------------------------------------------------------------------
6. Count Pairs with the given sum
Problem:
You are given an array of integers and a target sum. Your task is to count the number of pairs of integers in the array that sum up to the given target.

Input:
An array of integers.
Target sum.
Output:
An integer representing the count of pairs with the given sum.

Example:
Input:
Array: [1, 2, 3, 4, 5]
Target sum: 6(How much elements can for 6 in pair)

Output:
2

Explanation:
There are two pairs in the array that sum up to 6: (1, 5) and (2, 4).
