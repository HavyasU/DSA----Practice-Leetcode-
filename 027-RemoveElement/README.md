# 27. Remove Element

**Difficulty:** Easy

## Problem

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` in-place. The order of the elements may be changed. Return the number of elements in `nums` which are not equal to `val`.

## Examples

**Example 1:**

```
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
```

**Example 2:**

```
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
```

## Constraints

- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`

## Links

- [LeetCode Problem](https://leetcode.com/problems/remove-element/)

## Solution Approach

Use two pointers to overwrite elements equal to val with elements not equal to val.

## Complexity Analysis

- **Time Complexity:** O(n) - Single pass
- **Space Complexity:** O(1) - In-place
