# 392. Is Subsequence

**Difficulty:** Easy

## Problem

Given two strings `s` and `t`, return `true` if `s` is a subsequence of `t`, or `false` otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., `"ace"` is a subsequence of `"abcde"` while `"aec"` is not).

## Examples

**Example 1:**

```
Input: s = "abc", t = "ahbgdc"
Output: true
```

**Example 2:**

```
Input: s = "axc", t = "ahbgdc"
Output: false
```

## Constraints

- `0 <= s.length <= 100`
- `0 <= t.length <= 10^4`
- `s` and `t` consist only of lowercase English letters

## Links

- [LeetCode Problem](https://leetcode.com/problems/is-subsequence/)

## Solution Approach

Use two pointers to traverse both strings, advancing through s only when characters match.

## Complexity Analysis

- **Time Complexity:** O(n) - Where n is the length of t
- **Space Complexity:** O(1) - Constant space
