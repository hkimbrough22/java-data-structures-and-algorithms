# Library
## Stack and Queue
### [Stack](../lib/src/main/java/codechallenges/Stacks)
- Create a Stack class that has a top property. It creates an empty Stack when instantiated.
- This object should be aware of a default empty value assigned to top when the stack is created.
![Stack](stack1%20(1).png)
#### Methods:
##### Push
- Adds a new node with that value to the top of the stack with an O(1) Time performance.
- Arguments: value
##### Pop
- Arguments: none
- Returns: the value from node from the top of the stack
- Removes the node from the top of the stack
- Should raise exception when called on empty stack

##### Peek
- Arguments: none
- Returns: Value of the node located at the top of the stack
- Should raise exception when called on empty stack

##### isEmpty
- Arguments: none
- Returns: Boolean indicating whether the stack is empty.

### [Queue](../lib/src/main/java/codechallenges/Queue)
- Create a Queue class that has a front property. It creates an empty Queue when instantiated.
- This object should be aware of a default empty value assigned to front when the queue is created.
![Queue](Queue.png)
#### Methods:
##### enqueue
- Adds a new node with that value to the back of the queue with an O(1) Time performance.
- Arguments: value

##### dequeue
- Arguments: none
- Returns: the value from node from the front of the queue
- Removes the node from the front of the queue
- Should raise exception when called on empty queue

##### peek
- Arguments: none
- Returns: Value of the node located at the front of the queue
- Should raise exception when called on empty stack

##### isEmpty
- Arguments: none
- Returns: Boolean indicating whether the queue is empty

## Unit Tests
- Happy Path
- Expected Failure
- Edge Cases
<br><br>
[Back to Original README](../../README.md)