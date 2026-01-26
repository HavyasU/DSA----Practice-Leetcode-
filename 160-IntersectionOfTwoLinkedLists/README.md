# 160. Intersection of Two Linked Lists

**Difficulty:** Easy

## Problem

Given the heads of two singly linked-lists `headA` and `headB`, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return `null`.

The test cases are generated such that there are no cycles anywhere in the entire linked structure.

**Note:** The linked lists must retain their original structure after the function returns.

## Examples

**Example 1:**

```
Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
```

**Example 2:**

```
Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Intersected at '2'
```

**Example 3:**

```
Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: No intersection
```

## Constraints

- The number of nodes of `listA` is in the `m`
- The number of nodes of `listB` is in the `n`
- `1 <= m, n <= 3 * 10^4`
- `1 <= Node.val <= 10^5`

## Links

- [LeetCode Problem](https://leetcode.com/problems/intersection-of-two-linked-lists/)

## Solution Approach

Use two pointers. When a pointer reaches the end, redirect it to the other list's head. They will meet at intersection or both be null.

## Complexity Analysis

- **Time Complexity:** O(m + n) - Both pointers traverse both lists
- **Space Complexity:** O(1) - Constant space
