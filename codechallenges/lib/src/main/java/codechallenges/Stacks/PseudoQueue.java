package codechallenges.Stacks;

import codechallenges.linkedList.Node;

public class PseudoQueue<T> {
    Stack<T> stackOne = new Stack<T>();
    Stack<T> stackTwo = new Stack<T>();

    public Stack<T> enqueue(T value){
        Node<T> newNode = new Node<T>(value);
        if(stackOne.equals(null)) {
            stackOne.top = newNode;
            return stackOne;
        } else {
            newNode.next = stackOne.top;
            stackOne.top = newNode;
            return stackOne;
        }
    }
}