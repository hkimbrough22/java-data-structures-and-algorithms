package codechallenges.trees;

public class Node<T>
{
    T value;
    public Node<T> leftNode;
    public Node<T> rightNode;

    public Node(T value) {
        this.value = value;
    }
}
