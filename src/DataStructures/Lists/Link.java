package DataStructures.Lists;

/**
 * Created by nicholai on 9/30/16.
 */
public class Link<T> {
    private Link<T> prev;
    private Link<T> next;
    private T value;

    public Link(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public Link(T value, Link<T> nextNode) {
        this.value = value;
        this.next = nextNode;
    }

    private Link(T value, Link<T> previousNode, Link<T> nextNode){
        this.value = value;
        this.prev = previousNode;
        this.next = nextNode;
    }

    public T getValue(){
        return this.value;
    }

    public Link<T> getNextNode(){
        return this.next;
    }

    public void setNextNode(Link<T> node){
        this.next = node;
    }

    public Link<T> getPreviousNode(){
        return this.prev;
    }

    public void setPreviousNode(Link<T> prev){
        this.prev = prev;
    }
}