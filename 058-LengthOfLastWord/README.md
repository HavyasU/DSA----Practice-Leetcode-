# 58. Length of Last Word

**Difficulty:** Easy

## Problem

Given a string `s` consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

## Examples

**Example 1:**

```
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
```

**Example 2:**

```
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
```

**Example 3:**

```
Input: s = "luffy is still joyboy"
Output: 6
```

## Constraints

- `1 <= s.length <= 10^4`
- `s` consists of only English letters and spaces `' '`
- There will be at least one word in `s`

## Links

- [LeetCode Problem](https://leetcode.com/problems/length-of-last-word/)

## Solution Approach

Trim trailing spaces and traverse from the end until a space is found.

## Complexity Analysis

- **Time Complexity:** O(n) - Single pass from the end
- **Space Complexity:** O(1) - Constant space
