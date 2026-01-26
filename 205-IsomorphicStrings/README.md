# 205. Isomorphic Strings

**Difficulty:** Easy

## Problem

Given two strings `s` and `t`, determine if they are isomorphic.

Two strings `s` and `t` are isomorphic if the characters in `s` can be replaced to get `t`.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

## Examples

**Example 1:**

```
Input: s = "egg", t = "add"
Output: true
```

**Example 2:**

```
Input: s = "foo", t = "bar"
Output: false
```

**Example 3:**

```
Input: s = "paper", t = "title"
Output: true
```

## Constraints

- `1 <= s.length <= 5 * 10^4`
- `t.length == s.length`
- `s` and `t` consist of any valid ASCII character

## Links

- [LeetCode Problem](https://leetcode.com/problems/isomorphic-strings/)

## Solution Approach

Use two HashMaps to track character mappings from s to t and t to s.

## Complexity Analysis

- **Time Complexity:** O(n) - Single pass through strings
- **Space Complexity:** O(1) - Limited to ASCII character set
