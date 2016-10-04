package DataStructures.Queues;

import DataStructures.Lists.Link;

/**
 * Created by nicholai on 9/30/16.
 */
public class LIFOQueue<T> {

    private Link<T> baseLink;

    public LIFOQueue(){
        this.baseLink = null;
    }

    public void enqueue(T value){
        if(baseLink == null){
            baseLink = new Link<T>(value);
        } else {
            Link<T> newBase = new Link<T>(value);
            newBase.setNextNode(baseLink);
            baseLink = newBase;
        }
    }

    public T dequeue(){
        if(baseLink == null){
            throw new java.util.NoSuchElementException("No elements in queue");
        } else {
            T returnValue = baseLink.getValue();
            baseLink = baseLink.getNextNode();
            return returnValue;
        }
    }
}
