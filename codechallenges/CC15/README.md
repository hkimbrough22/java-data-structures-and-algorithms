# Library
## Trees
### Node Class
- Has properties for the value stored in the node, the left child node, and the right child node.

### Binary Tree
- Depth-first traversal methods:
  1. pre order
  2. in order
  3. post order 
- Returns an array of values
- Any exceptions or errors should be semantic, capture-able errors.
- For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.

### Binary Search Tree
- A sub-class of the Binary Tree Class, with the following additional methods:
- Add
  - Adds a new node with that value in the correct location in the binary search tree.
  - Arguments: value
  - Return: nothing
  - Contains
  - Argument: value
  - Returns: boolean indicating whether the value is in the tree at least once.

#### Tests
- Can successfully instantiate an empty tree
- Can successfully instantiate a tree with a single root node
- Can successfully add a left child and right child to a single root node
- Can successfully return a collection from a preorder traversal
- Can successfully return a collection from an inorder traversal
- Can successfully return a collection from a postorder traversal


  [Back to Original README](../../README.md)