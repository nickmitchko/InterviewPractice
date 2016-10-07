package DataStructures.Trees;

/**
 * Created by nicholai on 10/4/16.
 *
 * pg 295
 *
 *
 */
public class BinarySearchTree<T extends Comparable<T>> {

    private TreeNode<T> rootTreeNode;

    public BinarySearchTree(){
        this.rootTreeNode = null;
    }

    public BinarySearchTree(TreeNode<T> parent){
        this.rootTreeNode = parent;
    }

    /**
     * Recursive version of the function
     *
     * @param key The value to search for
     * @return The node which contains the value
     */
    public TreeNode<T> searchRecursive(T key){
        return this.treeSearchRecursive(this.rootTreeNode, key);
    }

    /**
     * Iterative version of the function
     *
     * @param key The value to search the tree for
     * @return The node which contains the value
     */
    public TreeNode<T> search(T key){
        return this.treeSearchIterative(this.rootTreeNode, key);
    }

    /**
     * @param x The node to start at
     * @param key The key to compare to
     * @return Returns the node with the found key
     */
    private TreeNode<T> treeSearchRecursive(TreeNode<T> x, T key){
        if(x == null || key == x.getValue()){
            return x;
        } else if(x.compareTo(key) < 0){
            return this.treeSearchRecursive(x.getLeftNode(), key);
        }
        return this.treeSearchRecursive(x.getRightNode(), key);
    }

    private TreeNode<T> treeSearchIterative(TreeNode<T> x, T key) {
        while(x != null && key != x.getValue()){
            if(x.compareTo(key) < 0){
                x = x.getLeftNode();
            } else {
                x = x.getRightNode();
            }
        }
        return x;
    }

    public TreeNode<T> minimum(){
        TreeNode<T> x = this.rootTreeNode;
        while (x.getLeftNode() != null){
            x = x.getLeftNode();
        }
        return x;
    }

    public TreeNode<T> maximum(){
        TreeNode<T> x = this.rootTreeNode;
        while(x.getRightNode() != null){
            x = x.getRightNode();
        }
        return x;
    }

    public TreeNode<T> successor(TreeNode<T> x){
        if(x.getRightNode() != null){
            return this.minimum();
        }
        TreeNode<T> y = x.getParentNode();
        while(y != null && x == y.getRightNode()){
            x = y;
            y = y.getParentNode();
        }
        return y;
    }

    public void insert(T value){
        TreeNode<T> z = new TreeNode<T>(value, null, null, null);   // Construct node with only our value (no connections)
        TreeNode<T> y = null;
        TreeNode<T> x = this.rootTreeNode;
        while(x != null){
            y = x;
            if(z.compareTo(x) < 0){
                x = x.getLeftNode();
            } else {
                x = x.getRightNode();
            }
        }
        z.setParent(y);
        if(y == null) {
            this.rootTreeNode = z;
        } else if (z.compareTo(y) < 0){
            y.setLeft(z);
        } else{
            y.setRight(z);
        }
    }

    /* TODO: Implement Transplant and Delete */

}
