# 242. Valid Anagram

**Difficulty:** Easy

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

## Examples

**Example 1:**

```
Input: s = "anagram", t = "nagaram"
Output: true
```

**Example 2:**

```
Input: s = "rat", t = "car"
Output: false
```

## Constraints

- `1 <= s.length, t.length <= 5 * 10^4`
- `s` and `t` consist of lowercase English letters

## Links

- [LeetCode Problem](https://leetcode.com/problems/valid-anagram/)

## Solution Approach

Sort both strings and compare, or use a frequency map to count character occurrences.

## Complexity Analysis

- **Time Complexity:** O(n log n) - Sorting approach, O(n) - HashMap approach
- **Space Complexity:** O(1) - Constant space for fixed alphabet size
