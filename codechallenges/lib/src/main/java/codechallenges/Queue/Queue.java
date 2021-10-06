package codechallenges.Queue;

import codechallenges.linkedList.Node;

public class Queue<T> {
    Node<T> front = null;
    Node<T> back = null;

    public void enqueue(T value) {
        Node<T> newNode = new Node<T>(value);
        if(isEmpty()){
            back = newNode;
            front = newNode;
        } else if(back == front) {
            front.next = back;
            back.next = newNode;
            back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
    }

    public T dequeue(){
        if(isEmpty()){
            throw new IllegalArgumentException("You cannot dequeue an empty Queue!");
        } else if(back == front){
            Node<T> nodeToDelete = front;
            back = null;
            front = null;
            return nodeToDelete.value;
        } else {
            Node<T> nodeToDelete = front;
            front = front.next;
            nodeToDelete.next = null;
            return nodeToDelete.value;
        }
    }

    public T peek(){
        if(isEmpty()){
            throw new IllegalArgumentException("You cannot peek an empty Queue!");
        } else return front.value;
    }

    public boolean isEmpty(){
        if(back.equals(null)){
            return true;
        } else return false;
    }
}
