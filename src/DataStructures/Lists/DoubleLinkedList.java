package DataStructures.Lists;
/**
 * Created by nicholai on 9/30/16.
 */
public class DoubleLinkedList<T> {

    private Link<T> baseNode;

    public DoubleLinkedList(){
        this.baseNode = null;
    }

    public DoubleLinkedList(T value){
        this.baseNode = new Link<>(value);
    }

    public DoubleLinkedList(Link<T> baseNode){
        this.baseNode = baseNode;
    }

    public void appendLink(T value){
        if(this.baseNode == null){
            this.baseNode = new Link<T>(value);
        } else {
            this.getLastLink().setNextNode(new Link<T>(value));
        }
    }

    public void appendLink(Link<T> node){
        if(this.baseNode == null){
            this.baseNode = node;
        } else {
            Link<T> last = this.getLastLink();
            last.setNextNode(node);
            node.setPreviousNode(last);
        }
    }

    public void insertLink(Link<T> anchor, Link<T> insert){
        Link<T> nextNode = anchor.getNextNode();
        anchor.setNextNode(insert);
        insert.setPreviousNode(anchor);
        insert.setNextNode(nextNode);
        nextNode.setPreviousNode(insert);
    }

    public Link<T> getLastLink(){
        if(this.baseNode == null){
            return this.baseNode;
        }
        Link<T> currentNode = this.baseNode;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

}
