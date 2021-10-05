# Library
## Stack-Queue-Pseudo
- Implements a Queue using two Stacks.
- Create a new class called pseudo queue.
- Do not use an existing Queue.
- Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below),
- Internally, utilize 2 Stack instances to create and manage the queue
### Methods:
#### enqueue
- Arguments: value
- Inserts value into the PseudoQueue, using a first-in, first-out approach.

- Example:
- Input
```aidl
  [10]->[15]->[20]
  Null
```
- Args
```aidl
5
5
```
- Output
```aidl
[5]->[10]->[15]->[20]
[5]
```

#### dequeue
- Arguments: none
- Extracts a value from the PseudoQueue, using a first-in, first-out approach.h
- Input
```aidl
  [5]->[10]->[15]->[20]
  [5]->[10]->[15]
```
- Output
```aidl
[20]
[15]
```
- Internal State
```aidl
[5]->[10]->[15]
[5]->[10]
```

## Unit Tests
- Happy Path
- Expected Failure
- Edge Cases

<br>[To Library](../lib/src/main/java/codechallenges/linkedList/LinkedList.java)
<br><br>
[Back to Original README](../../README.md)