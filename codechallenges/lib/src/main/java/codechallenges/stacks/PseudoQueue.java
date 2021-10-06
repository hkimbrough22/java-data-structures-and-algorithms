package codechallenges.stacks;

import codechallenges.linkedList.Node;

public class PseudoQueue {
    Stack stackOne = new Stack<T>();
    Stack stackTwo = new Stack<T>();

    public Stack enqueue(<T> value){
        Node newNode = new Node(value);
        if(stackOne == null) {
            stackOne.top = newNode;
            return stackOne;
        } else {
            newNode.next = stackOne.top;
            stackOne.top = newNode;
            return stackOne;
        }
    }
}