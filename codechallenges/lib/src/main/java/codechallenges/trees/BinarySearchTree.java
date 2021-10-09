package codechallenges.trees;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T> {
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        Node<T> node = root;
        while(true){
            if(newNode.value.compareTo(node.value) < 0) {
                if(node.leftNode != null) {
                    node =  node.leftNode;
                    add(node.value);
                }
            }

            if (newNode.value.compareTo(root.value) > 0) {
                //do stuff
            }
        }
    }

    public boolean contains(T value) {
        // TODO: implement me
        return false;
    }
}