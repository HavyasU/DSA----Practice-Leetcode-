# 28. Find the Index of the First Occurrence in a String

**Difficulty:** Easy

## Problem

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

## Examples

**Example 1:**

```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6. The first occurrence is at index 0.
```

**Example 2:**

```
Input: haystack = "leetcode", needle = "leeto"
Output: -1
```

## Constraints

- `1 <= haystack.length, needle.length <= 10^4`
- `haystack` and `needle` consist of only lowercase English characters

## Links

- [LeetCode Problem](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

## Solution Approach

Use Java's built-in `indexOf()` method or implement KMP algorithm for optimal solution.

## Complexity Analysis

- **Time Complexity:** O(n\*m) - Naive approach, O(n+m) - KMP algorithm
- **Space Complexity:** O(1) - Naive, O(m) - KMP
