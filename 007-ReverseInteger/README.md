# 7. Reverse Integer

**Difficulty:** Medium

## Problem

Given a signed 32-bit integer `x`, return `x` with its digits reversed. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, then return `0`.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

## Examples

**Example 1:**

```
Input: x = 123
Output: 321
```

**Example 2:**

```
Input: x = -123
Output: -321
```

**Example 3:**

```
Input: x = 120
Output: 21
```

## Constraints

- `-2^31 <= x <= 2^31 - 1`

## Links

- [LeetCode Problem](https://leetcode.com/problems/reverse-integer/)

## Solution Approach

Extract digits using modulo and division operations. Check for overflow before multiplying by 10.

## Complexity Analysis

- **Time Complexity:** O(log x) - Number of digits in x
- **Space Complexity:** O(1) - Constant space
