package DataStructures.Trees;

/**
 * Created by nicholai on 10/6/16.
 */

public class Node<T> {

    private Node<T> left,
                    right,
                    parent;

    private T value;

    public Node(T val,  Node<T> p, Node<T> l, Node<T> r){
        left = l;
        parent = p;
        right = r;
        value = val;
    }

    public T getValue(){
        return this.value;
    }

    public void setValue(T val){
        this.value = val;
    }

    public Node<T> getLeftNode(){
        return left;
    }

    public Node<T> getRightNode(){
        return right;
    }

    public Node<T> getParentNode(){
        return parent;
    }

    public void setLeft(Node<T> newLeft){
        left = newLeft;
    }

    public void setRight(Node<T> newRight){
        right = newRight;
    }

    public void setParent(Node<T> newParent){
        parent = newParent;
    }
}
