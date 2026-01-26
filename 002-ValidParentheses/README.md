# 20. Valid Parentheses

**Difficulty:** Easy

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

## Examples

**Example 1:**

```
Input: s = "()"
Output: true
```

**Example 2:**

```
Input: s = "()[]{}"
Output: true
```

**Example 3:**

```
Input: s = "(]"
Output: false
```

## Constraints

- `1 <= s.length <= 10^4`
- `s` consists of parentheses only `'()[]{}'`

## Links

- [LeetCode Problem](https://leetcode.com/problems/valid-parentheses/)

## Solution Approach

Use a stack to track opening brackets. When encountering a closing bracket, check if it matches the top of the stack.

## Complexity Analysis

- **Time Complexity:** O(n) - Single pass through the string
- **Space Complexity:** O(n) - Stack storage in worst case
