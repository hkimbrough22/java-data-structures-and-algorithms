# Library

## LinkedList kth
Method extends implementations for the [Linked List](../../codechallenges/CC05/README.md) class and [Insertions](../../codechallenges/CC06/README.md) class. 

### kth from end
- argument: a number, k, as a parameter.
- Return the node’s value that is k places from the tail of the linked list.

- Example:

Input
```aidl
head -> [1] -> [3] -> [8] -> [2] -> X
head -> [1] -> [3] -> [8] -> [2] -> X
head -> [1] -> [3] -> [8] -> [2] -> X
```
argument
```aidl
0
2
6
```
Output
```aidl
2
3
Exception
```


## Unit Tests
- Where k is greater than the length of the linked list
- Where k and the length of the list are the same
- Where k is not a positive integer
- Where the linked list is of a size 1
- “Happy Path” where k is not at the end, but somewhere in the middle of the linked list

<br>[To Library](../lib/src/main/java/codechallenges/linkedList/LinkedList.java)
<br><br>
[Back to Original README](../../README.md)