package Questions.BasicStructures.Queues;

import Questions.BasicStructures.Lists.Link;

/**
 * Created by nicholai on 9/30/16.
 */
public class FIFOQueue<T> {
    Link<T> head = null, tail = null;

    public FIFOQueue(){
    }

    public void enqueue(T value){
        Link<T> node = new Link<T>(value, null);
        if(this.empty()){
            head = node;
        } else {
            tail.setNextNode(node);
        }
        tail = node;
    }

    public T dequeue(){
        if(!this.empty()){
            T returnValue = head.getValue();
            head = head.getNextNode();
            return returnValue;
        } else{
            throw new java.util.NoSuchElementException("No Mode Elements");
        }
    }

    public boolean empty(){
        return head == null;
    }
}
