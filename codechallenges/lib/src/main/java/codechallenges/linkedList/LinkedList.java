
package codechallenges.linkedList;

public class LinkedList
{
    Node head = null;
    Node tail = null;  // not strictly required
//Adds a new node with that value to the head of the list with an O(1) Time performance.
    //{5, 1, 2, 3, 4, null}
    public void insert(int value)
    {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public boolean includes(int value)
    {
        return false;  // TODO: implement me
    }

    @Override
    public String toString()
    {
        return "null";  // TODO: implement me
    }
}