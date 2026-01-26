# 485. Max Consecutive Ones

**Difficulty:** Easy

## Problem

Given a binary array `nums`, return the maximum number of consecutive `1`'s in the array.

## Examples

**Example 1:**

```
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
```

**Example 2:**

```
Input: nums = [1,0,1,1,0,1]
Output: 2
```

## Constraints

- `1 <= nums.length <= 10^5`
- `nums[i]` is either `0` or `1`

## Links

- [LeetCode Problem](https://leetcode.com/problems/max-consecutive-ones/)

## Solution Approach

Traverse the array counting consecutive ones, keeping track of the maximum count.

## Complexity Analysis

- **Time Complexity:** O(n) - Single pass through array
- **Space Complexity:** O(1) - Constant space
