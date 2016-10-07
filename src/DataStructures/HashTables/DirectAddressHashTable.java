package DataStructures.HashTables;

/**
 * Created by nicholai on 10/6/16.
 */
public class DirectAddressHashTable{
    Object[] table;

    public DirectAddressHashTable(int size){
        this.table = new Object[size];
    }

    public Object search(int k){
        return this.table[k];
    }

    public void insert(int k, Object value){
        this.table[k] = value;
    }

    public void delete(int k){
        this.table[k] = null;
    }

}
