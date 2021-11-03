package codechallenges.TreeIntersection;

import codechallenges.hashMap.HashMap;
import codechallenges.trees.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection<T> {
    public List<T> tree_intersection(BinaryTree<T> tree1, BinaryTree<T> tree2){
        List<T> outputValues = new ArrayList<>();
        Object[] tree1Values = tree1.preOrderTraversal(tree1.root);
        Object[] tree2Values = tree2.preOrderTraversal(tree2.root);
        int size = tree1Values.length * 2;
        HashMap<Object, Integer> compareValues = new HashMap<>(size);
        for(int i = 0; i < size; i++) {
            compareValues.add(tree1Values[i], 0);
            if(compareValues.contains(tree2Values[i])){
                outputValues.add((T) tree1Values[i]);
            }
        }
        return outputValues;
    }
}