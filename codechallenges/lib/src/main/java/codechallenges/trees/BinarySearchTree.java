package codechallenges.trees;

import codechallenges.Queue.Queue;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T> {

    public String breadthFirst(BinaryTree tree){
        Node currentNode = tree.root;
        Queue queue = new Queue();
        while(currentNode != null) {
            queue.enqueue(currentNode.value);
            if(currentNode.leftNode != null) {
                currentNode = currentNode.leftNode;
            } else if(currentNode.rightNode != null) {
                currentNode = currentNode.rightNode;
            }
        }
    }

    public Object[] fizzBuzz(BinaryTree<T> tree){
        Object[] values = preOrderTraversal(tree.root);
        for(Object value : values) {
            if((int) value % 3 == 0) {
                value = "fizz";
            } else if ((int) value % 5 == 0) {
                value = "buzz";
            } else {value = value.toString();}
        }
        return values; //need to switch this to return a tree
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        Node<T> node = root;
        while(true){
            if(newNode.value.compareTo(node.value) < 0) {
                if(node.leftNode != null) {
                    node =  node.leftNode;
                    add(node.value);
                }
            }

            if (newNode.value.compareTo(root.value) > 0) {
                //do stuff
            }
        }
    }

    public boolean contains(T value) {
        // TODO: implement me
        return false;
    }
}