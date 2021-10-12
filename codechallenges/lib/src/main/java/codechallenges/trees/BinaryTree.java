package codechallenges.trees;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTree<T>
{
    Node <T> root;

    public Integer getMax() {
        //Couldn't figure out how to make an Object[] useful here to be able to compare the values within it and return the largest integer.
        Object[] values = this.preOrderTraversal(root);
        Integer currentMax = Integer.MIN_VALUE;
        ArrayList<T> internalValues = new ArrayList<>();
        for(Object value : values) {
            internalValues.add((T) value);
        }
        for(T value : internalValues) {
            if( value.currentMax) {

            }
        }
        return currentMax;
    }

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
