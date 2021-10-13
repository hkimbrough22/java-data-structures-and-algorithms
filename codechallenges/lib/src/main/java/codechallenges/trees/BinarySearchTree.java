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