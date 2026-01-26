# 383. Ransom Note

**Difficulty:** Easy

## Problem

Given two strings `ransomNote` and `magazine`, return `true` if `ransomNote` can be constructed by using the letters from `magazine` and `false` otherwise.

Each letter in `magazine` can only be used once in `ransomNote`.

## Examples

**Example 1:**

```
Input: ransomNote = "a", magazine = "b"
Output: false
```

**Example 2:**

```
Input: ransomNote = "aa", magazine = "ab"
Output: false
```

**Example 3:**

```
Input: ransomNote = "aa", magazine = "aab"
Output: true
```

## Constraints

- `1 <= ransomNote.length, magazine.length <= 10^5`
- `ransomNote` and `magazine` consist of lowercase English letters

## Links

- [LeetCode Problem](https://leetcode.com/problems/ransom-note/)

## Solution Approach

Count character frequencies in magazine, then check if ransomNote can be formed.

## Complexity Analysis

- **Time Complexity:** O(m + n) - Where m and n are string lengths
- **Space Complexity:** O(1) - Fixed size array for 26 letters
