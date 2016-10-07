package DataStructures.Trees;

/**
 * Created by nicholai on 10/6/16.
 */

public class TreeNode<T extends Comparable<T>> implements Comparable<TreeNode<T>> {

    private TreeNode<T> left,
                    right,
                    parent;

    private T value;

    public TreeNode(T val, TreeNode<T> p, TreeNode<T> l, TreeNode<T> r){
        this.left = l;
        this.parent = p;
        this.right = r;
        this.value = val;
    }

    public T getValue(){
        return this.value;
    }

    public void setValue(T val){
        this.value = val;
    }

    public TreeNode<T> getLeftNode(){
        return this.left;
    }

    public TreeNode<T> getRightNode(){
        return this.right;
    }

    public TreeNode<T> getParentNode(){
        return this.parent;
    }

    public void setLeft(TreeNode<T> newLeft){
        this.left = newLeft;
    }

    public void setRight(TreeNode<T> newRight){
        this.right = newRight;
    }

    public void setParent(TreeNode<T> newParent){
        this.parent = newParent;
    }

    public int compareTo(TreeNode<T> node){
        return this.value.compareTo(node.value);
    }

    public int compareTo(T value){
        return this.value.compareTo(value);
    }
}
