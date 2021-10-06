package codechallenges.stacks;

import codechallenges.linkedList.Node;

public class Stack<T> {
    Node<T> top = null;

    public void push(T value){
        Node<T> newNode = new Node<T>(value);
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;
    }

    public T pop() {
        if(isEmpty()) {
            throw new IllegalArgumentException("You cannot pop an empty stack!");
        } else {
            Node<T> tempNode = top;
            top = top.next;
            tempNode.next = null;
            return tempNode.value;
        }
    }

    public T peek(){
        if(isEmpty()) {
            throw new IllegalArgumentException("You cannot peek an empty stack!");
        } else {
            return top.value;
        }
    }

    public boolean isEmpty(){
        if(top.equals(null)){
            return true;
        } else return false;
    }

}
