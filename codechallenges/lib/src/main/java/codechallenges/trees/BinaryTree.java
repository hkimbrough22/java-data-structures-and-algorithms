package codechallenges.trees;

import java.util.ArrayList;

public class BinaryTree<T>
{
     Node <T> root;

    public Object[] preOrderTraversal(Node<T> _node)
    {
        Object[] outputValues = null;
        ArrayList<T> internalValues = new ArrayList<>();
        internalValues.add(_node.value);
        if(_node.leftNode != null) {
            preOrderTraversal(_node.leftNode);
        }
        if(_node.rightNode != null) {
            preOrderTraversal(_node.rightNode);
        }
        outputValues = internalValues.toArray();
        return outputValues;
    }

    public Object[] inOrderTraversal(Node<T> _node)
    {
        Object[] outputValues = null;
        ArrayList<T> internalValues = new ArrayList<>();
        if(_node.leftNode != null) {
            preOrderTraversal(_node.leftNode);
        }
        internalValues.add(_node.value);
        if(_node.rightNode != null) {
            preOrderTraversal(_node.rightNode);
        }
        outputValues = internalValues.toArray();
        return outputValues;
    }

    public Object[] postOrderTraversal(Node<T> _node)
    {
        Object[] outputValues = null;
        ArrayList<T> internalValues = new ArrayList<>();
        if(_node.leftNode != null) {
            preOrderTraversal(_node.leftNode);
        }
        if(_node.rightNode != null) {
            preOrderTraversal(_node.rightNode);
        }
        internalValues.add(_node.value);
        outputValues = internalValues.toArray();
        return outputValues;
    }
}
