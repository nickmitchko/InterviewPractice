package DataStructures.Trees;

/**
 * Created by nicholai on 10/4/16.
 */
public class BinarySearchTree<T> {

    private Node<T> rootNode;

    public BinarySearchTree(){
        this.rootNode = null;
    }

    public BinarySearchTree(){

    }

    public Node<T> search(){
        return treeSearch();
    }
}
