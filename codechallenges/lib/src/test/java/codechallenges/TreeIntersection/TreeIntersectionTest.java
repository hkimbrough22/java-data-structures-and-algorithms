package codechallenges.TreeIntersection;

import codechallenges.trees.BinaryTree;
import codechallenges.trees.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeIntersectionTest {

    @Test
    void findValuesInBothTrees(){
        BinaryTree<Integer> tree1 = new BinaryTree<>();
        tree1.root = new Node<>(150);
        tree1.root.leftNode = new Node<>(100);
        tree1.root.leftNode.rightNode = new Node<>(160);
        tree1.root.leftNode.rightNode.leftNode = new Node<>(125);
        tree1.root.leftNode.rightNode.rightNode = new Node<>(175);
        tree1.root.leftNode.leftNode = new Node<>(75);
        tree1.root.rightNode = new Node<>(250);
        tree1.root.rightNode.leftNode = new Node<>(200);
        tree1.root.rightNode.rightNode = new Node<>(350);
        tree1.root.rightNode.rightNode.leftNode = new Node<>(300);
        tree1.root.rightNode.rightNode.rightNode = new Node<>(500);

        BinaryTree<Integer> tree2 = new BinaryTree<>();
        tree2.root = new Node<>(42);
        tree2.root.leftNode = new Node<>(100);
        tree2.root.leftNode.rightNode = new Node<>(160);
        tree2.root.leftNode.rightNode.leftNode = new Node<>(125);
        tree2.root.leftNode.rightNode.rightNode = new Node<>(175);
        tree2.root.leftNode.leftNode = new Node<>(15);
        tree2.root.rightNode = new Node<>(600);
        tree2.root.rightNode.leftNode = new Node<>(200);
        tree2.root.rightNode.rightNode = new Node<>(350);
        tree2.root.rightNode.rightNode.leftNode = new Node<>(4);
        tree2.root.rightNode.rightNode.rightNode = new Node<>(500);

        TreeIntersection<Integer> integerTreeIntersection = new TreeIntersection<>();
        List<Integer> actualValues = integerTreeIntersection.tree_intersection(tree1, tree2);
        System.out.println(actualValues);
//        assertEquals()

    }
}
