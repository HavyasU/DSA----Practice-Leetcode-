# 11. Container With Most Water

**Difficulty:** Medium

## Problem

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `i-th` line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

**Notice:** You may not slant the container.

## Examples

**Example 1:**

```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The max area is between index 1 and 8, area = min(8,7) * (8-1) = 49
```

**Example 2:**

```
Input: height = [1,1]
Output: 1
```

## Constraints

- `n == height.length`
- `2 <= n <= 10^5`
- `0 <= height[i] <= 10^4`

## Links

- [LeetCode Problem](https://leetcode.com/problems/container-with-most-water/)

## Solution Approach

Use two pointers starting from both ends. Move the pointer with the smaller height inward to potentially find a larger area.

## Complexity Analysis

- **Time Complexity:** O(n) - Single pass with two pointers
- **Space Complexity:** O(1) - Constant space
