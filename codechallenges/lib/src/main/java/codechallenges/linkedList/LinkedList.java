
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
        if(this.head == null) {
            return false;
        } else {
            Node newNode = head;
            while (true) {
                if (newNode.value == value) {
                    return true;
                } else {
                    if(newNode == null) {
                        return false;
                    } else newNode = newNode.next;
                }
            }
        }
    }

    @Override
    public String toString()
    {
        Node newNode = head;
        String stringToReturn = "";
        while(true) {
            if(newNode == null) {
                stringToReturn += "NULL";
                return stringToReturn;
            } else {
                stringToReturn += "{ " +newNode.value+ " } -> ";
                newNode = newNode.next;
            }
        }
    }
}