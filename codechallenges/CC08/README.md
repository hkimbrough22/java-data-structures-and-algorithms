# Library
## LinkedList Zip
Method extends implementations for the [Linked List](../../codechallenges/CC05/README.md) class and [Insertions](../../codechallenges/CC06/README.md) class.

### Zip Lists
- Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list.
- Arguments: 2 linked lists
- Return: Linked List, zipped as noted below

- Example:
- Arguments
```aidl
List1 = head -> [1] -> [3] -> [2] -> X	
List2 = head -> [5] -> [9] -> [4] -> X

List1 = head -> [1] -> [3] -> X
List2 = head -> [5] -> [9] -> [4] -> X

```
Output
```aidl
head -> [1] -> [5] -> [3] -> [9] -> [2] -> [4] -> X

head -> [1] -> [5] -> [3] -> [9] -> [4] -> X
```

## Unit Tests
- Happy Path
- Expected Failure
- Edge Cases

<br>[To Library](../lib/src/main/java/codechallenges/linkedList/LinkedList.java)
<br><br>
[Back to Original README](../../README.md)