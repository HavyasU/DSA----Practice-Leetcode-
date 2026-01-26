# 283. Move Zeroes

**Difficulty:** Easy

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

**Note:** You must do this in-place without making a copy of the array.

## Examples

**Example 1:**

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
```

**Example 2:**

```
Input: nums = [0]
Output: [0]
```

## Constraints

- `1 <= nums.length <= 10^4`
- `-2^31 <= nums[i] <= 2^31 - 1`

## Links

- [LeetCode Problem](https://leetcode.com/problems/move-zeroes/)

## Solution Approach

Use two pointers: one to track non-zero position, one to iterate. Swap non-zero elements to the front.

## Complexity Analysis

- **Time Complexity:** O(n) - Single pass through array
- **Space Complexity:** O(1) - In-place operation
