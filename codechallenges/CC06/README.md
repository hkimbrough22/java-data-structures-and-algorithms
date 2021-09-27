# Library

## LinkedList Insertions
Uses theWrite the following methods for the [Linked List](../../codechallenges/CC05/README.md) class:

### append
- arguments: new value
- adds a new node with the given value to the end of the list

- Example: 

Initial List
```
head -> [1] -> [3] -> [2] -> X	
head -> X
```

Method Args
```
5
1
```

Resulting List
```
head -> [1] -> [3] -> [2] -> [5] -> X 
head -> [1] -> X
```

### insert before
- arguments: value, new value
- adds a new node with the given new value immediately before the first node that has the value specified

- Example:

Initial List
```
head -> [1] -> [3] -> [2] -> X
head -> [1] -> [3] -> [2] -> X
head -> [1] -> [3] -> [2] -> X	
```

Method Args
```
3, 5
1, 5
4, 5	
```

Resulting List
```
head -> [1] -> [5] -> [3] -> [2] -> X
head -> [5] -> [1] -> [3] -> [2] -> X
No change, method exception
```
### insert after
- arguments: value, new value
- adds a new node with the given new value immediately after the first node that has the value specified

- Example:

Initial List
```
head -> [1] -> [3] -> [2] -> X
head -> [1] -> [3] -> [2] -> X
head -> [1] -> [3] -> [2] -> X	
```

Method Args
```
3, 5
2, 5
4, 5	
```

Resulting List
```
head -> [1] -> [3] -> [5] -> [2] -> X
head -> [1] -> [3] -> [2] -> [5] -> X
No change, method exception
```

## Unit Tests
- Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

- You have access to the Node class and all the properties on the Linked List class.

- Write tests to prove the following functionality:
  - Can successfully add a node to the end of the linked list
  - Can successfully add multiple nodes to the end of a linked list
  - Can successfully insert a node before a node located i the middle of a linked list
  - Can successfully insert a node before the first node of a linked list
  - Can successfully insert after a node in the middle of the linked list
  - Can successfully insert a node after the last node of the linked list

<br>[To Library](../lib/src/main/java/codechallenges/linkedList/LinkedList.java)
<br><br>
[Back to Original README](../../README.md)