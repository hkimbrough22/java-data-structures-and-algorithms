
package codechallenges.linkedList;

public class LinkedList<T> {
    Node<T> head = null;
    Node<T> tail = null;  // not strictly required

    //Adds a new node with that value to the head of the list with an O(1) Time performance.
    //{5, 1, 2, 3, 4, null}
    public void insert(T value) {
        Node<T> newNode = new Node<T>(value);
        newNode.next = head;
        head = newNode;
    }

    public boolean includes(int value) {
        if (this.head == null) {
            return false;
        } else {
            Node<T> newNode = head;
            while (true) {
                if (newNode.value.equals(value)) {
                    return true;
                } else {
                    newNode = newNode.next;
                }
            }
        }
    }

    @Override
    public String toString() {
        Node<T> newNode = head;
        String stringToReturn = "";
        while (true) {
            if (newNode == null) {
                stringToReturn += "NULL";
                return stringToReturn;
            } else {
                stringToReturn += "{ " + newNode.value + " } -> ";
                newNode = newNode.next;
            }
        }
    }

    public void append(T value) {
        Node<T> newNode = new Node<T>(value);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> nodeToTest = head;
            while (true) {
                if (nodeToTest.next == null) {
                    nodeToTest.next = newNode;
                    break;
                } else {
                    nodeToTest = nodeToTest.next;
                }
            }
        }
    }

    public void insertBefore(T valueToFind, T valueToAdd) {
        Node<T> newNode = new Node<T>(valueToAdd);
        //newNode.next = Node@ valueToFind
        if (this.head == null) {
            this.head = newNode;
        } else if (this.head.value == valueToFind) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> nodeToTest = head;
            Node<T> prev = null;
            while (true) {
                if (nodeToTest.value == valueToFind) {
                    prev.next = newNode;
                    newNode.next = nodeToTest;
                    break;
                } else if (nodeToTest.next != null) {
                    prev = nodeToTest;
                    nodeToTest = nodeToTest.next;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    public void insertAfter(T valueToFind, T valueToAdd) {
        Node<T> newNode = new Node<T>(valueToAdd);
        //newNode.next = Node@ valueToFind
        if (this.head == null) {
            this.head = newNode;
        } else if (this.head.value.equals(valueToFind)) {
            newNode.next = head.next;
            head.next = newNode;
        } else {
            Node<T> nodeToTest = head;
            while (true) {
                if (nodeToTest.value == valueToFind) {
                    newNode.next = nodeToTest.next;
                    nodeToTest.next = newNode;
                    break;
                } else if (nodeToTest.next != null) {
                    nodeToTest = nodeToTest.next;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    public T kthFromEnd(int k) {
        if (k < 0) {
            throw new IllegalArgumentException("Your value must be larger than 0");
        }
        if (this.head == null) {
            throw new IllegalArgumentException("The Linked List is empty");
        } else {
            int length = 1;
            Node<T> nodeToTest = head;
            while (true) {
                if (nodeToTest.next == null) {
                    nodeToTest = head;
                    length -= k;
                    if (length <= 0) {
                        throw new IllegalArgumentException("The Linked List does not have that many items.");
                    } else {
                        for (int i = 1; i < length; i++) {
                            nodeToTest = nodeToTest.next;
                        }
                        return nodeToTest.value;
                    }
                } else {
                    nodeToTest = nodeToTest.next;
                    length++;
                }
            }
        }
    }

    public static LinkedList zipLists(LinkedList list1, LinkedList list2) {
//        https://www.geeksforgeeks.org/merge-a-linked-list-into-another-linked-list-at-alternate-positions/
        Node list1Node = list1.head;
        Node list2Node = list2.head;
        while(list1Node != null && list2Node != null) {

        Node list1NextNode = list1Node.next;
        Node list2NextNode = list2Node.next;

        list1Node.next = list2Node;
        list2Node.next = list1NextNode;

        list1Node = list1NextNode;
        list2Node = list2NextNode;
        }
        System.out.println(list1);
        return list1;
    }
}