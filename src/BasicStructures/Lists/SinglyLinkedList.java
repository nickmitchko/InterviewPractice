package BasicStructures.Lists;

/**
 * Created by nicholai on 9/30/16.
 */
public class SinglyLinkedList<T> {

    private Link<T> baseNode;

    public SinglyLinkedList(){
        this.baseNode = null;
    }

    public SinglyLinkedList(T value){
        this.baseNode = new Link<>(value);
    }

    public void appendLink(T value){
        if(this.baseNode == null){
            this.baseNode= new Link<T>(value);
        } else {
            this.getLastLink().setNextNode(new Link<T>(value));
        }
    }

    public void insertLink(Link<T> anchor, Link<T> insert){
        insert.setNextNode(anchor.getNextNode());
        anchor.setNextNode(insert);
    }

    private Link<T> getLastLink(){
        if(this.baseNode == null){
            return this.baseNode;
        }
        Link<T> currentNode = this.baseNode;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    private void setBaseNode(Link<T> link){
        link.setNextNode(this.baseNode.getNextNode());
        this.baseNode = link;
    }
}
